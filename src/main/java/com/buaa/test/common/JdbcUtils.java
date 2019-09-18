package com.buaa.test.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component
public class JdbcUtils {

    @Autowired
    private DataSource ds;
    private final ThreadLocal<Connection> tl = new ThreadLocal<>();

    public Connection getConnection() {
        Connection con = tl.get();
        if (con == null) {
            try {
                return ds.getConnection();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return con;
    }

    public void releaseConnection(Connection con) {
        if (con != null && con != tl.get()) {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void transcationBegin() {
        if (tl.get() == null) {
            try {
                Connection con = ds.getConnection();
                con.setAutoCommit(false);
                tl.set(con);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void transcationCommit() {
        Connection con = tl.get();
        if (con != null) {
            try {
                con.commit();
                con.close();
                tl.set(null);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void transcationRollback() {
        Connection con = tl.get();
        if (con != null) {
            try {
                con.rollback();
                con.close();
                tl.set(null);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
