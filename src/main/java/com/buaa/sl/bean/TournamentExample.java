package com.buaa.sl.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TournamentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,tournaments
     */
    public TournamentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,tournaments
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,tournaments
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,tournaments
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,tournaments
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,tournaments
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,tournaments
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,tournaments
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,tournaments
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,tournaments
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,tournaments
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：tournaments
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTournamentIdIsNull() {
            addCriterion("tournament_id is null");
            return (Criteria) this;
        }

        public Criteria andTournamentIdIsNotNull() {
            addCriterion("tournament_id is not null");
            return (Criteria) this;
        }

        public Criteria andTournamentIdEqualTo(Integer value) {
            addCriterion("tournament_id =", value, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andTournamentIdNotEqualTo(Integer value) {
            addCriterion("tournament_id <>", value, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andTournamentIdGreaterThan(Integer value) {
            addCriterion("tournament_id >", value, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andTournamentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tournament_id >=", value, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andTournamentIdLessThan(Integer value) {
            addCriterion("tournament_id <", value, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andTournamentIdLessThanOrEqualTo(Integer value) {
            addCriterion("tournament_id <=", value, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andTournamentIdIn(List<Integer> values) {
            addCriterion("tournament_id in", values, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andTournamentIdNotIn(List<Integer> values) {
            addCriterion("tournament_id not in", values, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andTournamentIdBetween(Integer value1, Integer value2) {
            addCriterion("tournament_id between", value1, value2, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andTournamentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tournament_id not between", value1, value2, "tournamentId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andInIsNull() {
            addCriterion("in_ is null");
            return (Criteria) this;
        }

        public Criteria andInIsNotNull() {
            addCriterion("in_ is not null");
            return (Criteria) this;
        }

        public Criteria andInEqualTo(Integer value) {
            addCriterion("in_ =", value, "in");
            return (Criteria) this;
        }

        public Criteria andInNotEqualTo(Integer value) {
            addCriterion("in_ <>", value, "in");
            return (Criteria) this;
        }

        public Criteria andInGreaterThan(Integer value) {
            addCriterion("in_ >", value, "in");
            return (Criteria) this;
        }

        public Criteria andInGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_ >=", value, "in");
            return (Criteria) this;
        }

        public Criteria andInLessThan(Integer value) {
            addCriterion("in_ <", value, "in");
            return (Criteria) this;
        }

        public Criteria andInLessThanOrEqualTo(Integer value) {
            addCriterion("in_ <=", value, "in");
            return (Criteria) this;
        }

        public Criteria andInIn(List<Integer> values) {
            addCriterion("in_ in", values, "in");
            return (Criteria) this;
        }

        public Criteria andInNotIn(List<Integer> values) {
            addCriterion("in_ not in", values, "in");
            return (Criteria) this;
        }

        public Criteria andInBetween(Integer value1, Integer value2) {
            addCriterion("in_ between", value1, value2, "in");
            return (Criteria) this;
        }

        public Criteria andInNotBetween(Integer value1, Integer value2) {
            addCriterion("in_ not between", value1, value2, "in");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsIsNull() {
            addCriterion("num_of_teams is null");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsIsNotNull() {
            addCriterion("num_of_teams is not null");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsEqualTo(Integer value) {
            addCriterion("num_of_teams =", value, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsNotEqualTo(Integer value) {
            addCriterion("num_of_teams <>", value, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsGreaterThan(Integer value) {
            addCriterion("num_of_teams >", value, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_of_teams >=", value, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsLessThan(Integer value) {
            addCriterion("num_of_teams <", value, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsLessThanOrEqualTo(Integer value) {
            addCriterion("num_of_teams <=", value, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsIn(List<Integer> values) {
            addCriterion("num_of_teams in", values, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsNotIn(List<Integer> values) {
            addCriterion("num_of_teams not in", values, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsBetween(Integer value1, Integer value2) {
            addCriterion("num_of_teams between", value1, value2, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andNumOfTeamsNotBetween(Integer value1, Integer value2) {
            addCriterion("num_of_teams not between", value1, value2, "numOfTeams");
            return (Criteria) this;
        }

        public Criteria andPrizeIsNull() {
            addCriterion("prize is null");
            return (Criteria) this;
        }

        public Criteria andPrizeIsNotNull() {
            addCriterion("prize is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeEqualTo(Double value) {
            addCriterion("prize =", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotEqualTo(Double value) {
            addCriterion("prize <>", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeGreaterThan(Double value) {
            addCriterion("prize >", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeGreaterThanOrEqualTo(Double value) {
            addCriterion("prize >=", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeLessThan(Double value) {
            addCriterion("prize <", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeLessThanOrEqualTo(Double value) {
            addCriterion("prize <=", value, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeIn(List<Double> values) {
            addCriterion("prize in", values, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotIn(List<Double> values) {
            addCriterion("prize not in", values, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeBetween(Double value1, Double value2) {
            addCriterion("prize between", value1, value2, "prize");
            return (Criteria) this;
        }

        public Criteria andPrizeNotBetween(Double value1, Double value2) {
            addCriterion("prize not between", value1, value2, "prize");
            return (Criteria) this;
        }

        public Criteria andChampionIsNull() {
            addCriterion("champion is null");
            return (Criteria) this;
        }

        public Criteria andChampionIsNotNull() {
            addCriterion("champion is not null");
            return (Criteria) this;
        }

        public Criteria andChampionEqualTo(Integer value) {
            addCriterion("champion =", value, "champion");
            return (Criteria) this;
        }

        public Criteria andChampionNotEqualTo(Integer value) {
            addCriterion("champion <>", value, "champion");
            return (Criteria) this;
        }

        public Criteria andChampionGreaterThan(Integer value) {
            addCriterion("champion >", value, "champion");
            return (Criteria) this;
        }

        public Criteria andChampionGreaterThanOrEqualTo(Integer value) {
            addCriterion("champion >=", value, "champion");
            return (Criteria) this;
        }

        public Criteria andChampionLessThan(Integer value) {
            addCriterion("champion <", value, "champion");
            return (Criteria) this;
        }

        public Criteria andChampionLessThanOrEqualTo(Integer value) {
            addCriterion("champion <=", value, "champion");
            return (Criteria) this;
        }

        public Criteria andChampionIn(List<Integer> values) {
            addCriterion("champion in", values, "champion");
            return (Criteria) this;
        }

        public Criteria andChampionNotIn(List<Integer> values) {
            addCriterion("champion not in", values, "champion");
            return (Criteria) this;
        }

        public Criteria andChampionBetween(Integer value1, Integer value2) {
            addCriterion("champion between", value1, value2, "champion");
            return (Criteria) this;
        }

        public Criteria andChampionNotBetween(Integer value1, Integer value2) {
            addCriterion("champion not between", value1, value2, "champion");
            return (Criteria) this;
        }

        public Criteria andRunnerUpIsNull() {
            addCriterion("runner-up is null");
            return (Criteria) this;
        }

        public Criteria andRunnerUpIsNotNull() {
            addCriterion("runner-up is not null");
            return (Criteria) this;
        }

        public Criteria andRunnerUpEqualTo(Integer value) {
            addCriterion("runner-up =", value, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andRunnerUpNotEqualTo(Integer value) {
            addCriterion("runner-up <>", value, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andRunnerUpGreaterThan(Integer value) {
            addCriterion("runner-up >", value, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andRunnerUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("runner-up >=", value, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andRunnerUpLessThan(Integer value) {
            addCriterion("runner-up <", value, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andRunnerUpLessThanOrEqualTo(Integer value) {
            addCriterion("runner-up <=", value, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andRunnerUpIn(List<Integer> values) {
            addCriterion("runner-up in", values, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andRunnerUpNotIn(List<Integer> values) {
            addCriterion("runner-up not in", values, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andRunnerUpBetween(Integer value1, Integer value2) {
            addCriterion("runner-up between", value1, value2, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andRunnerUpNotBetween(Integer value1, Integer value2) {
            addCriterion("runner-up not between", value1, value2, "runnerUp");
            return (Criteria) this;
        }

        public Criteria andSponsoredByIsNull() {
            addCriterion("sponsored_by is null");
            return (Criteria) this;
        }

        public Criteria andSponsoredByIsNotNull() {
            addCriterion("sponsored_by is not null");
            return (Criteria) this;
        }

        public Criteria andSponsoredByEqualTo(Integer value) {
            addCriterion("sponsored_by =", value, "sponsoredBy");
            return (Criteria) this;
        }

        public Criteria andSponsoredByNotEqualTo(Integer value) {
            addCriterion("sponsored_by <>", value, "sponsoredBy");
            return (Criteria) this;
        }

        public Criteria andSponsoredByGreaterThan(Integer value) {
            addCriterion("sponsored_by >", value, "sponsoredBy");
            return (Criteria) this;
        }

        public Criteria andSponsoredByGreaterThanOrEqualTo(Integer value) {
            addCriterion("sponsored_by >=", value, "sponsoredBy");
            return (Criteria) this;
        }

        public Criteria andSponsoredByLessThan(Integer value) {
            addCriterion("sponsored_by <", value, "sponsoredBy");
            return (Criteria) this;
        }

        public Criteria andSponsoredByLessThanOrEqualTo(Integer value) {
            addCriterion("sponsored_by <=", value, "sponsoredBy");
            return (Criteria) this;
        }

        public Criteria andSponsoredByIn(List<Integer> values) {
            addCriterion("sponsored_by in", values, "sponsoredBy");
            return (Criteria) this;
        }

        public Criteria andSponsoredByNotIn(List<Integer> values) {
            addCriterion("sponsored_by not in", values, "sponsoredBy");
            return (Criteria) this;
        }

        public Criteria andSponsoredByBetween(Integer value1, Integer value2) {
            addCriterion("sponsored_by between", value1, value2, "sponsoredBy");
            return (Criteria) this;
        }

        public Criteria andSponsoredByNotBetween(Integer value1, Integer value2) {
            addCriterion("sponsored_by not between", value1, value2, "sponsoredBy");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：tournaments
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：tournaments
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}