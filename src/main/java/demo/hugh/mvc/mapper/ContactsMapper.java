package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Contacts;
import demo.hugh.mvc.po.ContactsExample;
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

public interface ContactsMapper {
    @SelectProvider(type=ContactsSqlProvider.class, method="countByExample")
    int countByExample(ContactsExample example);

    @DeleteProvider(type=ContactsSqlProvider.class, method="deleteByExample")
    int deleteByExample(ContactsExample example);

    @Delete({
        "delete from contacts",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into contacts (id, user_id, ",
        "card_name, email, ",
        "mobile, wechat, ",
        "qq, weibo)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{cardName,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{mobile,jdbcType=VARCHAR}, #{wechat,jdbcType=VARCHAR}, ",
        "#{qq,jdbcType=VARCHAR}, #{weibo,jdbcType=VARCHAR})"
    })
    int insert(Contacts record);

    @InsertProvider(type=ContactsSqlProvider.class, method="insertSelective")
    int insertSelective(Contacts record);

    @SelectProvider(type=ContactsSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="card_name", property="cardName", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="wechat", property="wechat", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="weibo", property="weibo", jdbcType=JdbcType.VARCHAR)
    })
    List<Contacts> selectByExample(ContactsExample example);

    @Select({
        "select",
        "id, user_id, card_name, email, mobile, wechat, qq, weibo",
        "from contacts",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="card_name", property="cardName", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="mobile", property="mobile", jdbcType=JdbcType.VARCHAR),
        @Result(column="wechat", property="wechat", jdbcType=JdbcType.VARCHAR),
        @Result(column="qq", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="weibo", property="weibo", jdbcType=JdbcType.VARCHAR)
    })
    Contacts selectByPrimaryKey(Integer id);

    @UpdateProvider(type=ContactsSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Contacts record, @Param("example") ContactsExample example);

    @UpdateProvider(type=ContactsSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Contacts record, @Param("example") ContactsExample example);

    @UpdateProvider(type=ContactsSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Contacts record);

    @Update({
        "update contacts",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "card_name = #{cardName,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "mobile = #{mobile,jdbcType=VARCHAR},",
          "wechat = #{wechat,jdbcType=VARCHAR},",
          "qq = #{qq,jdbcType=VARCHAR},",
          "weibo = #{weibo,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Contacts record);
}