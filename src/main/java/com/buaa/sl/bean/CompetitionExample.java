package com.buaa.sl.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompetitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     *  构造查询条件,competitions
     */
    public CompetitionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,competitions
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,competitions
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,competitions
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,competitions
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,competitions
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,competitions
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,competitions
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,competitions
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,competitions
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,competitions
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * GeneratedCriteria
     * 数据库表：competitions
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

        public Criteria andCompetitionsIsNull() {
            addCriterion("competitions is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionsIsNotNull() {
            addCriterion("competitions is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionsEqualTo(Integer value) {
            addCriterion("competitions =", value, "competitions");
            return (Criteria) this;
        }

        public Criteria andCompetitionsNotEqualTo(Integer value) {
            addCriterion("competitions <>", value, "competitions");
            return (Criteria) this;
        }

        public Criteria andCompetitionsGreaterThan(Integer value) {
            addCriterion("competitions >", value, "competitions");
            return (Criteria) this;
        }

        public Criteria andCompetitionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("competitions >=", value, "competitions");
            return (Criteria) this;
        }

        public Criteria andCompetitionsLessThan(Integer value) {
            addCriterion("competitions <", value, "competitions");
            return (Criteria) this;
        }

        public Criteria andCompetitionsLessThanOrEqualTo(Integer value) {
            addCriterion("competitions <=", value, "competitions");
            return (Criteria) this;
        }

        public Criteria andCompetitionsIn(List<Integer> values) {
            addCriterion("competitions in", values, "competitions");
            return (Criteria) this;
        }

        public Criteria andCompetitionsNotIn(List<Integer> values) {
            addCriterion("competitions not in", values, "competitions");
            return (Criteria) this;
        }

        public Criteria andCompetitionsBetween(Integer value1, Integer value2) {
            addCriterion("competitions between", value1, value2, "competitions");
            return (Criteria) this;
        }

        public Criteria andCompetitionsNotBetween(Integer value1, Integer value2) {
            addCriterion("competitions not between", value1, value2, "competitions");
            return (Criteria) this;
        }

        public Criteria andFromIsNull() {
            addCriterion("from_ is null");
            return (Criteria) this;
        }

        public Criteria andFromIsNotNull() {
            addCriterion("from_ is not null");
            return (Criteria) this;
        }

        public Criteria andFromEqualTo(Integer value) {
            addCriterion("from_ =", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotEqualTo(Integer value) {
            addCriterion("from_ <>", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThan(Integer value) {
            addCriterion("from_ >", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_ >=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThan(Integer value) {
            addCriterion("from_ <", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThanOrEqualTo(Integer value) {
            addCriterion("from_ <=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromIn(List<Integer> values) {
            addCriterion("from_ in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotIn(List<Integer> values) {
            addCriterion("from_ not in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromBetween(Integer value1, Integer value2) {
            addCriterion("from_ between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotBetween(Integer value1, Integer value2) {
            addCriterion("from_ not between", value1, value2, "from");
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

        public Criteria andRadiantIsNull() {
            addCriterion("radiant is null");
            return (Criteria) this;
        }

        public Criteria andRadiantIsNotNull() {
            addCriterion("radiant is not null");
            return (Criteria) this;
        }

        public Criteria andRadiantEqualTo(Integer value) {
            addCriterion("radiant =", value, "radiant");
            return (Criteria) this;
        }

        public Criteria andRadiantNotEqualTo(Integer value) {
            addCriterion("radiant <>", value, "radiant");
            return (Criteria) this;
        }

        public Criteria andRadiantGreaterThan(Integer value) {
            addCriterion("radiant >", value, "radiant");
            return (Criteria) this;
        }

        public Criteria andRadiantGreaterThanOrEqualTo(Integer value) {
            addCriterion("radiant >=", value, "radiant");
            return (Criteria) this;
        }

        public Criteria andRadiantLessThan(Integer value) {
            addCriterion("radiant <", value, "radiant");
            return (Criteria) this;
        }

        public Criteria andRadiantLessThanOrEqualTo(Integer value) {
            addCriterion("radiant <=", value, "radiant");
            return (Criteria) this;
        }

        public Criteria andRadiantIn(List<Integer> values) {
            addCriterion("radiant in", values, "radiant");
            return (Criteria) this;
        }

        public Criteria andRadiantNotIn(List<Integer> values) {
            addCriterion("radiant not in", values, "radiant");
            return (Criteria) this;
        }

        public Criteria andRadiantBetween(Integer value1, Integer value2) {
            addCriterion("radiant between", value1, value2, "radiant");
            return (Criteria) this;
        }

        public Criteria andRadiantNotBetween(Integer value1, Integer value2) {
            addCriterion("radiant not between", value1, value2, "radiant");
            return (Criteria) this;
        }

        public Criteria andDireIsNull() {
            addCriterion("dire is null");
            return (Criteria) this;
        }

        public Criteria andDireIsNotNull() {
            addCriterion("dire is not null");
            return (Criteria) this;
        }

        public Criteria andDireEqualTo(Integer value) {
            addCriterion("dire =", value, "dire");
            return (Criteria) this;
        }

        public Criteria andDireNotEqualTo(Integer value) {
            addCriterion("dire <>", value, "dire");
            return (Criteria) this;
        }

        public Criteria andDireGreaterThan(Integer value) {
            addCriterion("dire >", value, "dire");
            return (Criteria) this;
        }

        public Criteria andDireGreaterThanOrEqualTo(Integer value) {
            addCriterion("dire >=", value, "dire");
            return (Criteria) this;
        }

        public Criteria andDireLessThan(Integer value) {
            addCriterion("dire <", value, "dire");
            return (Criteria) this;
        }

        public Criteria andDireLessThanOrEqualTo(Integer value) {
            addCriterion("dire <=", value, "dire");
            return (Criteria) this;
        }

        public Criteria andDireIn(List<Integer> values) {
            addCriterion("dire in", values, "dire");
            return (Criteria) this;
        }

        public Criteria andDireNotIn(List<Integer> values) {
            addCriterion("dire not in", values, "dire");
            return (Criteria) this;
        }

        public Criteria andDireBetween(Integer value1, Integer value2) {
            addCriterion("dire between", value1, value2, "dire");
            return (Criteria) this;
        }

        public Criteria andDireNotBetween(Integer value1, Integer value2) {
            addCriterion("dire not between", value1, value2, "dire");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Double value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Double value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Double value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Double value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Double value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Double value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Double> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Double> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Double value1, Double value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Double value1, Double value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsIsNull() {
            addCriterion("radiant_kills is null");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsIsNotNull() {
            addCriterion("radiant_kills is not null");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsEqualTo(Integer value) {
            addCriterion("radiant_kills =", value, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsNotEqualTo(Integer value) {
            addCriterion("radiant_kills <>", value, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsGreaterThan(Integer value) {
            addCriterion("radiant_kills >", value, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsGreaterThanOrEqualTo(Integer value) {
            addCriterion("radiant_kills >=", value, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsLessThan(Integer value) {
            addCriterion("radiant_kills <", value, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsLessThanOrEqualTo(Integer value) {
            addCriterion("radiant_kills <=", value, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsIn(List<Integer> values) {
            addCriterion("radiant_kills in", values, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsNotIn(List<Integer> values) {
            addCriterion("radiant_kills not in", values, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsBetween(Integer value1, Integer value2) {
            addCriterion("radiant_kills between", value1, value2, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andRadiantKillsNotBetween(Integer value1, Integer value2) {
            addCriterion("radiant_kills not between", value1, value2, "radiantKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsIsNull() {
            addCriterion("dire_kills is null");
            return (Criteria) this;
        }

        public Criteria andDireKillsIsNotNull() {
            addCriterion("dire_kills is not null");
            return (Criteria) this;
        }

        public Criteria andDireKillsEqualTo(Integer value) {
            addCriterion("dire_kills =", value, "direKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsNotEqualTo(Integer value) {
            addCriterion("dire_kills <>", value, "direKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsGreaterThan(Integer value) {
            addCriterion("dire_kills >", value, "direKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsGreaterThanOrEqualTo(Integer value) {
            addCriterion("dire_kills >=", value, "direKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsLessThan(Integer value) {
            addCriterion("dire_kills <", value, "direKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsLessThanOrEqualTo(Integer value) {
            addCriterion("dire_kills <=", value, "direKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsIn(List<Integer> values) {
            addCriterion("dire_kills in", values, "direKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsNotIn(List<Integer> values) {
            addCriterion("dire_kills not in", values, "direKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsBetween(Integer value1, Integer value2) {
            addCriterion("dire_kills between", value1, value2, "direKills");
            return (Criteria) this;
        }

        public Criteria andDireKillsNotBetween(Integer value1, Integer value2) {
            addCriterion("dire_kills not between", value1, value2, "direKills");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：competitions
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * Criterion
     * 数据库表：competitions
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