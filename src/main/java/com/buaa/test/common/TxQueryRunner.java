package com.buaa.test.common;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@Component
public class TxQueryRunner extends QueryRunner {

    @Autowired
    private JdbcUtils utils;

    @Override
    public int[] batch(String sql, Object[][] params) throws SQLException {
        Connection con = utils.getConnection();
        int[] rs = super.batch(con, sql, params);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public <T> T query(String sql, ResultSetHandler<T> rsh, Object... params) throws SQLException {
        Connection con = utils.getConnection();
        T rs = super.query(con, sql, rsh, params);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public <T> T query(String sql, ResultSetHandler<T> rsh) throws SQLException {
        Connection con = utils.getConnection();
        T rs = super.query(con, sql, rsh);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public int update(String sql) throws SQLException {
        Connection con = utils.getConnection();
        int rs = super.update(con, sql);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public int update(String sql, Object param) throws SQLException {
        Connection con = utils.getConnection();
        int rs = super.update(con, sql, param);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public int update(String sql, Object... params) throws SQLException {
        Connection con = utils.getConnection();
        int rs = super.update(con, sql, params);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public <T> T insert(String sql, ResultSetHandler<T> rsh) throws SQLException {
        Connection con = utils.getConnection();
        T rs = super.insert(con, sql, rsh);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public <T> T insert(String sql, ResultSetHandler<T> rsh, Object... params) throws SQLException {
        Connection con = utils.getConnection();
        T rs = super.insert(con, sql, rsh, params);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public <T> T insertBatch(String sql, ResultSetHandler<T> rsh, Object[][] params) throws SQLException {
        Connection con = utils.getConnection();
        T rs = super.insertBatch(con, sql, rsh, params);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public int execute(String sql, Object... params) throws SQLException {
        Connection con = utils.getConnection();
        int rs = super.execute(con, sql, params);
        utils.releaseConnection(con);
        return rs;
    }

    @Override
    public <T> List<T> execute(String sql, ResultSetHandler<T> rsh, Object... params) throws SQLException {
        Connection con = utils.getConnection();
        List<T> rs = super.execute(con, sql, rsh, params);
        utils.releaseConnection(con);
        return rs;
    }


}
