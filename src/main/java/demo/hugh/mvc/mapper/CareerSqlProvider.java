package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Career;
import demo.hugh.mvc.po.CareerExample.Criteria;
import demo.hugh.mvc.po.CareerExample.Criterion;
import demo.hugh.mvc.po.CareerExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CareerSqlProvider {

    public String countByExample(CareerExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("career");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CareerExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("career");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Career record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("career");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyId() != null) {
            sql.VALUES("company_id", "#{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyName() != null) {
            sql.VALUES("company_name", "#{companyName,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyNameEn() != null) {
            sql.VALUES("company_name_en", "#{companyNameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getOfficeNumber() != null) {
            sql.VALUES("office_number", "#{officeNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getOfficeEmail() != null) {
            sql.VALUES("office_email", "#{officeEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getDepartment() != null) {
            sql.VALUES("department", "#{department,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.VALUES("title", "#{title,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginDate() != null) {
            sql.VALUES("begin_date", "#{beginDate,jdbcType=DATE}");
        }
        
        if (record.getEndDate() != null) {
            sql.VALUES("end_date", "#{endDate,jdbcType=DATE}");
        }
        
        return sql.toString();
    }

    public String selectByExample(CareerExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("user_id");
        sql.SELECT("company_id");
        sql.SELECT("company_name");
        sql.SELECT("company_name_en");
        sql.SELECT("office_number");
        sql.SELECT("office_email");
        sql.SELECT("department");
        sql.SELECT("title");
        sql.SELECT("begin_date");
        sql.SELECT("end_date");
        sql.FROM("career");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Career record = (Career) parameter.get("record");
        CareerExample example = (CareerExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("career");
        
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyName() != null) {
            sql.SET("company_name = #{record.companyName,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyNameEn() != null) {
            sql.SET("company_name_en = #{record.companyNameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getOfficeNumber() != null) {
            sql.SET("office_number = #{record.officeNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getOfficeEmail() != null) {
            sql.SET("office_email = #{record.officeEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getDepartment() != null) {
            sql.SET("department = #{record.department,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginDate() != null) {
            sql.SET("begin_date = #{record.beginDate,jdbcType=DATE}");
        }
        
        if (record.getEndDate() != null) {
            sql.SET("end_date = #{record.endDate,jdbcType=DATE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("career");
        
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("user_id = #{record.userId,jdbcType=INTEGER}");
        sql.SET("company_id = #{record.companyId,jdbcType=INTEGER}");
        sql.SET("company_name = #{record.companyName,jdbcType=VARCHAR}");
        sql.SET("company_name_en = #{record.companyNameEn,jdbcType=VARCHAR}");
        sql.SET("office_number = #{record.officeNumber,jdbcType=VARCHAR}");
        sql.SET("office_email = #{record.officeEmail,jdbcType=VARCHAR}");
        sql.SET("department = #{record.department,jdbcType=VARCHAR}");
        sql.SET("title = #{record.title,jdbcType=VARCHAR}");
        sql.SET("begin_date = #{record.beginDate,jdbcType=DATE}");
        sql.SET("end_date = #{record.endDate,jdbcType=DATE}");
        
        CareerExample example = (CareerExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Career record) {
        SQL sql = new SQL();
        sql.UPDATE("career");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyId() != null) {
            sql.SET("company_id = #{companyId,jdbcType=INTEGER}");
        }
        
        if (record.getCompanyName() != null) {
            sql.SET("company_name = #{companyName,jdbcType=VARCHAR}");
        }
        
        if (record.getCompanyNameEn() != null) {
            sql.SET("company_name_en = #{companyNameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getOfficeNumber() != null) {
            sql.SET("office_number = #{officeNumber,jdbcType=VARCHAR}");
        }
        
        if (record.getOfficeEmail() != null) {
            sql.SET("office_email = #{officeEmail,jdbcType=VARCHAR}");
        }
        
        if (record.getDepartment() != null) {
            sql.SET("department = #{department,jdbcType=VARCHAR}");
        }
        
        if (record.getTitle() != null) {
            sql.SET("title = #{title,jdbcType=VARCHAR}");
        }
        
        if (record.getBeginDate() != null) {
            sql.SET("begin_date = #{beginDate,jdbcType=DATE}");
        }
        
        if (record.getEndDate() != null) {
            sql.SET("end_date = #{endDate,jdbcType=DATE}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CareerExample example, boolean includeExamplePhrase) {
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