package demo.hugh.mvc.po;

import java.util.ArrayList;
import java.util.List;

public class YuhunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YuhunExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Integer value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Integer value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Integer value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Integer value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Integer value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Integer> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Integer> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Integer value1, Integer value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Integer value1, Integer value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andBuffattackIsNull() {
            addCriterion("buffAttack is null");
            return (Criteria) this;
        }

        public Criteria andBuffattackIsNotNull() {
            addCriterion("buffAttack is not null");
            return (Criteria) this;
        }

        public Criteria andBuffattackEqualTo(String value) {
            addCriterion("buffAttack =", value, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackNotEqualTo(String value) {
            addCriterion("buffAttack <>", value, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackGreaterThan(String value) {
            addCriterion("buffAttack >", value, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackGreaterThanOrEqualTo(String value) {
            addCriterion("buffAttack >=", value, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackLessThan(String value) {
            addCriterion("buffAttack <", value, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackLessThanOrEqualTo(String value) {
            addCriterion("buffAttack <=", value, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackLike(String value) {
            addCriterion("buffAttack like", value, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackNotLike(String value) {
            addCriterion("buffAttack not like", value, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackIn(List<String> values) {
            addCriterion("buffAttack in", values, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackNotIn(List<String> values) {
            addCriterion("buffAttack not in", values, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackBetween(String value1, String value2) {
            addCriterion("buffAttack between", value1, value2, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackNotBetween(String value1, String value2) {
            addCriterion("buffAttack not between", value1, value2, "buffattack");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionIsNull() {
            addCriterion("buffAttackAddition is null");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionIsNotNull() {
            addCriterion("buffAttackAddition is not null");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionEqualTo(String value) {
            addCriterion("buffAttackAddition =", value, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionNotEqualTo(String value) {
            addCriterion("buffAttackAddition <>", value, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionGreaterThan(String value) {
            addCriterion("buffAttackAddition >", value, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionGreaterThanOrEqualTo(String value) {
            addCriterion("buffAttackAddition >=", value, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionLessThan(String value) {
            addCriterion("buffAttackAddition <", value, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionLessThanOrEqualTo(String value) {
            addCriterion("buffAttackAddition <=", value, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionLike(String value) {
            addCriterion("buffAttackAddition like", value, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionNotLike(String value) {
            addCriterion("buffAttackAddition not like", value, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionIn(List<String> values) {
            addCriterion("buffAttackAddition in", values, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionNotIn(List<String> values) {
            addCriterion("buffAttackAddition not in", values, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionBetween(String value1, String value2) {
            addCriterion("buffAttackAddition between", value1, value2, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffattackadditionNotBetween(String value1, String value2) {
            addCriterion("buffAttackAddition not between", value1, value2, "buffattackaddition");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateIsNull() {
            addCriterion("buffCritRate is null");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateIsNotNull() {
            addCriterion("buffCritRate is not null");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateEqualTo(String value) {
            addCriterion("buffCritRate =", value, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateNotEqualTo(String value) {
            addCriterion("buffCritRate <>", value, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateGreaterThan(String value) {
            addCriterion("buffCritRate >", value, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateGreaterThanOrEqualTo(String value) {
            addCriterion("buffCritRate >=", value, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateLessThan(String value) {
            addCriterion("buffCritRate <", value, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateLessThanOrEqualTo(String value) {
            addCriterion("buffCritRate <=", value, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateLike(String value) {
            addCriterion("buffCritRate like", value, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateNotLike(String value) {
            addCriterion("buffCritRate not like", value, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateIn(List<String> values) {
            addCriterion("buffCritRate in", values, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateNotIn(List<String> values) {
            addCriterion("buffCritRate not in", values, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateBetween(String value1, String value2) {
            addCriterion("buffCritRate between", value1, value2, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcritrateNotBetween(String value1, String value2) {
            addCriterion("buffCritRate not between", value1, value2, "buffcritrate");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageIsNull() {
            addCriterion("buffCriticalDamage is null");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageIsNotNull() {
            addCriterion("buffCriticalDamage is not null");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageEqualTo(String value) {
            addCriterion("buffCriticalDamage =", value, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageNotEqualTo(String value) {
            addCriterion("buffCriticalDamage <>", value, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageGreaterThan(String value) {
            addCriterion("buffCriticalDamage >", value, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageGreaterThanOrEqualTo(String value) {
            addCriterion("buffCriticalDamage >=", value, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageLessThan(String value) {
            addCriterion("buffCriticalDamage <", value, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageLessThanOrEqualTo(String value) {
            addCriterion("buffCriticalDamage <=", value, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageLike(String value) {
            addCriterion("buffCriticalDamage like", value, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageNotLike(String value) {
            addCriterion("buffCriticalDamage not like", value, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageIn(List<String> values) {
            addCriterion("buffCriticalDamage in", values, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageNotIn(List<String> values) {
            addCriterion("buffCriticalDamage not in", values, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageBetween(String value1, String value2) {
            addCriterion("buffCriticalDamage between", value1, value2, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andBuffcriticaldamageNotBetween(String value1, String value2) {
            addCriterion("buffCriticalDamage not between", value1, value2, "buffcriticaldamage");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNull() {
            addCriterion("planId is null");
            return (Criteria) this;
        }

        public Criteria andPlanidIsNotNull() {
            addCriterion("planId is not null");
            return (Criteria) this;
        }

        public Criteria andPlanidEqualTo(Integer value) {
            addCriterion("planId =", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotEqualTo(Integer value) {
            addCriterion("planId <>", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThan(Integer value) {
            addCriterion("planId >", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("planId >=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThan(Integer value) {
            addCriterion("planId <", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidLessThanOrEqualTo(Integer value) {
            addCriterion("planId <=", value, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidIn(List<Integer> values) {
            addCriterion("planId in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotIn(List<Integer> values) {
            addCriterion("planId not in", values, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidBetween(Integer value1, Integer value2) {
            addCriterion("planId between", value1, value2, "planid");
            return (Criteria) this;
        }

        public Criteria andPlanidNotBetween(Integer value1, Integer value2) {
            addCriterion("planId not between", value1, value2, "planid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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