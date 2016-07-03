package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.User;
import demo.hugh.mvc.po.UserExample;
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

public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    int countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
    int deleteByExample(UserExample example);

    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into user (id, user_no, ",
        "login_name, password, ",
        "user_name, birthday, ",
        "is_lunar, avatar, bound_mobile, ",
        "bound_email)",
        "values (#{id,jdbcType=INTEGER}, #{userNo,jdbcType=VARCHAR}, ",
        "#{loginName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{birthday,jdbcType=TIMESTAMP}, ",
        "#{isLunar,jdbcType=BIT}, #{avatar,jdbcType=VARCHAR}, #{boundMobile,jdbcType=VARCHAR}, ",
        "#{boundEmail,jdbcType=VARCHAR})"
    })
    int insert(User record);

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_no", property="userNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_lunar", property="isLunar", jdbcType=JdbcType.BIT),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="bound_mobile", property="boundMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="bound_email", property="boundEmail", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, user_no, login_name, password, user_name, birthday, is_lunar, avatar, bound_mobile, ",
        "bound_email",
        "from user",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_no", property="userNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_name", property="loginName", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_name", property="userName", jdbcType=JdbcType.VARCHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="is_lunar", property="isLunar", jdbcType=JdbcType.BIT),
        @Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        @Result(column="bound_mobile", property="boundMobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="bound_email", property="boundEmail", jdbcType=JdbcType.VARCHAR)
    })
    User selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set user_no = #{userNo,jdbcType=VARCHAR},",
          "login_name = #{loginName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "birthday = #{birthday,jdbcType=TIMESTAMP},",
          "is_lunar = #{isLunar,jdbcType=BIT},",
          "avatar = #{avatar,jdbcType=VARCHAR},",
          "bound_mobile = #{boundMobile,jdbcType=VARCHAR},",
          "bound_email = #{boundEmail,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User record);
}