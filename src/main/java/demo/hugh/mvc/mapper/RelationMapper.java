package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Relation;
import demo.hugh.mvc.po.RelationExample;
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

public interface RelationMapper {
    @SelectProvider(type=RelationSqlProvider.class, method="countByExample")
    int countByExample(RelationExample example);

    @DeleteProvider(type=RelationSqlProvider.class, method="deleteByExample")
    int deleteByExample(RelationExample example);

    @Delete({
        "delete from relation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into relation (id, user_id, ",
        "second_user_id, relationship_id, ",
        "appellation, create_time, ",
        "remark)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{secondUserId,jdbcType=INTEGER}, #{relationshipId,jdbcType=INTEGER}, ",
        "#{appellation,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(Relation record);

    @InsertProvider(type=RelationSqlProvider.class, method="insertSelective")
    int insertSelective(Relation record);

    @SelectProvider(type=RelationSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="second_user_id", property="secondUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="relationship_id", property="relationshipId", jdbcType=JdbcType.INTEGER),
        @Result(column="appellation", property="appellation", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    List<Relation> selectByExample(RelationExample example);

    @Select({
        "select",
        "id, user_id, second_user_id, relationship_id, appellation, create_time, remark",
        "from relation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="second_user_id", property="secondUserId", jdbcType=JdbcType.INTEGER),
        @Result(column="relationship_id", property="relationshipId", jdbcType=JdbcType.INTEGER),
        @Result(column="appellation", property="appellation", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remark", property="remark", jdbcType=JdbcType.VARCHAR)
    })
    Relation selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RelationSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Relation record, @Param("example") RelationExample example);

    @UpdateProvider(type=RelationSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Relation record, @Param("example") RelationExample example);

    @UpdateProvider(type=RelationSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Relation record);

    @Update({
        "update relation",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "second_user_id = #{secondUserId,jdbcType=INTEGER},",
          "relationship_id = #{relationshipId,jdbcType=INTEGER},",
          "appellation = #{appellation,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Relation record);
}