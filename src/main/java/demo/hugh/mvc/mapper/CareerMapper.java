package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Career;
import demo.hugh.mvc.po.CareerExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CareerMapper {
    @SelectProvider(type=CareerSqlProvider.class, method="countByExample")
    int countByExample(CareerExample example);

    @DeleteProvider(type=CareerSqlProvider.class, method="deleteByExample")
    int deleteByExample(CareerExample example);

    @Delete({
        "delete from career",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into career (id, user_id, ",
        "company_id, company_name, ",
        "company_name_en, office_number, ",
        "office_email, department, ",
        "title, begin_date, end_date)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{companyId,jdbcType=INTEGER}, #{companyName,jdbcType=VARCHAR}, ",
        "#{companyNameEn,jdbcType=VARCHAR}, #{officeNumber,jdbcType=VARCHAR}, ",
        "#{officeEmail,jdbcType=VARCHAR}, #{department,jdbcType=VARCHAR}, ",
        "#{title,jdbcType=VARCHAR}, #{beginDate,jdbcType=DATE}, #{endDate,jdbcType=DATE})"
    })
    int insert(Career record);

    @InsertProvider(type=CareerSqlProvider.class, method="insertSelective")
    int insertSelective(Career record);

    @SelectProvider(type=CareerSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="company_name", property="companyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_name_en", property="companyNameEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="office_number", property="officeNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="office_email", property="officeEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="department", property="department", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_date", property="beginDate", jdbcType=JdbcType.DATE),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.DATE)
    })
    List<Career> selectByExample(CareerExample example);

    @Select({
        "select",
        "id, user_id, company_id, company_name, company_name_en, office_number, office_email, ",
        "department, title, begin_date, end_date",
        "from career",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="company_id", property="companyId", jdbcType=JdbcType.INTEGER),
        @Result(column="company_name", property="companyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_name_en", property="companyNameEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="office_number", property="officeNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="office_email", property="officeEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="department", property="department", jdbcType=JdbcType.VARCHAR),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_date", property="beginDate", jdbcType=JdbcType.DATE),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.DATE)
    })
    Career selectByPrimaryKey(Integer id);

    @UpdateProvider(type=CareerSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Career record, @Param("example") CareerExample example);

    @UpdateProvider(type=CareerSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Career record, @Param("example") CareerExample example);

    @UpdateProvider(type=CareerSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Career record);

    @Update({
        "update career",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "company_id = #{companyId,jdbcType=INTEGER},",
          "company_name = #{companyName,jdbcType=VARCHAR},",
          "company_name_en = #{companyNameEn,jdbcType=VARCHAR},",
          "office_number = #{officeNumber,jdbcType=VARCHAR},",
          "office_email = #{officeEmail,jdbcType=VARCHAR},",
          "department = #{department,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "begin_date = #{beginDate,jdbcType=DATE},",
          "end_date = #{endDate,jdbcType=DATE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Career record);
}