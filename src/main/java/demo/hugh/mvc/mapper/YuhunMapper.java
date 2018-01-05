package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Yuhun;
import demo.hugh.mvc.po.YuhunExample;
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

public interface YuhunMapper {
    @SelectProvider(type=YuhunSqlProvider.class, method="countByExample")
    long countByExample(YuhunExample example);

    @DeleteProvider(type=YuhunSqlProvider.class, method="deleteByExample")
    int deleteByExample(YuhunExample example);

    @Delete({
        "delete from yuhun",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into yuhun (id, userId, ",
        "position, type, ",
        "buffAttack, buffAttackAddition, ",
        "buffCritRate, buffCriticalDamage, ",
        "planId)",
        "values (#{id,jdbcType=INTEGER}, #{userid,jdbcType=INTEGER}, ",
        "#{position,jdbcType=INTEGER}, #{type,jdbcType=VARCHAR}, ",
        "#{buffattack,jdbcType=VARCHAR}, #{buffattackaddition,jdbcType=VARCHAR}, ",
        "#{buffcritrate,jdbcType=VARCHAR}, #{buffcriticaldamage,jdbcType=VARCHAR}, ",
        "#{planid,jdbcType=INTEGER})"
    })
    int insert(Yuhun record);

    @InsertProvider(type=YuhunSqlProvider.class, method="insertSelective")
    int insertSelective(Yuhun record);

    @SelectProvider(type=YuhunSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="position", property="position", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="buffAttack", property="buffattack", jdbcType=JdbcType.VARCHAR),
        @Result(column="buffAttackAddition", property="buffattackaddition", jdbcType=JdbcType.VARCHAR),
        @Result(column="buffCritRate", property="buffcritrate", jdbcType=JdbcType.VARCHAR),
        @Result(column="buffCriticalDamage", property="buffcriticaldamage", jdbcType=JdbcType.VARCHAR),
        @Result(column="planId", property="planid", jdbcType=JdbcType.INTEGER)
    })
    List<Yuhun> selectByExample(YuhunExample example);

    @Select({
        "select",
        "id, userId, position, type, buffAttack, buffAttackAddition, buffCritRate, buffCriticalDamage, ",
        "planId",
        "from yuhun",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="userId", property="userid", jdbcType=JdbcType.INTEGER),
        @Result(column="position", property="position", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="buffAttack", property="buffattack", jdbcType=JdbcType.VARCHAR),
        @Result(column="buffAttackAddition", property="buffattackaddition", jdbcType=JdbcType.VARCHAR),
        @Result(column="buffCritRate", property="buffcritrate", jdbcType=JdbcType.VARCHAR),
        @Result(column="buffCriticalDamage", property="buffcriticaldamage", jdbcType=JdbcType.VARCHAR),
        @Result(column="planId", property="planid", jdbcType=JdbcType.INTEGER)
    })
    Yuhun selectByPrimaryKey(Integer id);

    @UpdateProvider(type=YuhunSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Yuhun record, @Param("example") YuhunExample example);

    @UpdateProvider(type=YuhunSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Yuhun record, @Param("example") YuhunExample example);

    @UpdateProvider(type=YuhunSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Yuhun record);

    @Update({
        "update yuhun",
        "set userId = #{userid,jdbcType=INTEGER},",
          "position = #{position,jdbcType=INTEGER},",
          "type = #{type,jdbcType=VARCHAR},",
          "buffAttack = #{buffattack,jdbcType=VARCHAR},",
          "buffAttackAddition = #{buffattackaddition,jdbcType=VARCHAR},",
          "buffCritRate = #{buffcritrate,jdbcType=VARCHAR},",
          "buffCriticalDamage = #{buffcriticaldamage,jdbcType=VARCHAR},",
          "planId = #{planid,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Yuhun record);
}