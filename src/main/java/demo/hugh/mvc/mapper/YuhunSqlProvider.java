package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Yuhun;
import demo.hugh.mvc.po.YuhunExample.Criteria;
import demo.hugh.mvc.po.YuhunExample.Criterion;
import demo.hugh.mvc.po.YuhunExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class YuhunSqlProvider {

    public String countByExample(YuhunExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("yuhun");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(YuhunExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("yuhun");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Yuhun record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("yuhun");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserid() != null) {
            sql.VALUES("userId", "#{userid,jdbcType=INTEGER}");
        }
        
        if (record.getPosition() != null) {
            sql.VALUES("position", "#{position,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.VALUES("type", "#{type,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffattack() != null) {
            sql.VALUES("buffAttack", "#{buffattack,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffattackaddition() != null) {
            sql.VALUES("buffAttackAddition", "#{buffattackaddition,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffcritrate() != null) {
            sql.VALUES("buffCritRate", "#{buffcritrate,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffcriticaldamage() != null) {
            sql.VALUES("buffCriticalDamage", "#{buffcriticaldamage,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanid() != null) {
            sql.VALUES("planId", "#{planid,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    public String selectByExample(YuhunExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("userId");
        sql.SELECT("position");
        sql.SELECT("type");
        sql.SELECT("buffAttack");
        sql.SELECT("buffAttackAddition");
        sql.SELECT("buffCritRate");
        sql.SELECT("buffCriticalDamage");
        sql.SELECT("planId");
        sql.FROM("yuhun");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Yuhun record = (Yuhun) parameter.get("record");
        YuhunExample example = (YuhunExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("yuhun");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getUserid() != null) {
            sql.SET("userId = #{record.userid,jdbcType=INTEGER}");
        }
        
        if (record.getPosition() != null) {
            sql.SET("position = #{record.position,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{record.type,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffattack() != null) {
            sql.SET("buffAttack = #{record.buffattack,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffattackaddition() != null) {
            sql.SET("buffAttackAddition = #{record.buffattackaddition,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffcritrate() != null) {
            sql.SET("buffCritRate = #{record.buffcritrate,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffcriticaldamage() != null) {
            sql.SET("buffCriticalDamage = #{record.buffcriticaldamage,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanid() != null) {
            sql.SET("planId = #{record.planid,jdbcType=INTEGER}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("yuhun");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("userId = #{record.userid,jdbcType=INTEGER}");
        sql.SET("position = #{record.position,jdbcType=INTEGER}");
        sql.SET("type = #{record.type,jdbcType=VARCHAR}");
        sql.SET("buffAttack = #{record.buffattack,jdbcType=VARCHAR}");
        sql.SET("buffAttackAddition = #{record.buffattackaddition,jdbcType=VARCHAR}");
        sql.SET("buffCritRate = #{record.buffcritrate,jdbcType=VARCHAR}");
        sql.SET("buffCriticalDamage = #{record.buffcriticaldamage,jdbcType=VARCHAR}");
        sql.SET("planId = #{record.planid,jdbcType=INTEGER}");
        
        YuhunExample example = (YuhunExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Yuhun record) {
        SQL sql = new SQL();
        sql.UPDATE("yuhun");
        
        if (record.getUserid() != null) {
            sql.SET("userId = #{userid,jdbcType=INTEGER}");
        }
        
        if (record.getPosition() != null) {
            sql.SET("position = #{position,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            sql.SET("type = #{type,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffattack() != null) {
            sql.SET("buffAttack = #{buffattack,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffattackaddition() != null) {
            sql.SET("buffAttackAddition = #{buffattackaddition,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffcritrate() != null) {
            sql.SET("buffCritRate = #{buffcritrate,jdbcType=VARCHAR}");
        }
        
        if (record.getBuffcriticaldamage() != null) {
            sql.SET("buffCriticalDamage = #{buffcriticaldamage,jdbcType=VARCHAR}");
        }
        
        if (record.getPlanid() != null) {
            sql.SET("planId = #{planid,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, YuhunExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}