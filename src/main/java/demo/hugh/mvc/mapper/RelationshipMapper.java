package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Relationship;
import demo.hugh.mvc.po.RelationshipExample;
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

public interface RelationshipMapper {
    @SelectProvider(type=RelationshipSqlProvider.class, method="countByExample")
    int countByExample(RelationshipExample example);

    @DeleteProvider(type=RelationshipSqlProvider.class, method="deleteByExample")
    int deleteByExample(RelationshipExample example);

    @Delete({
        "delete from relationship",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into relationship (id, relationship, ",
        "relation_weigth, appellations)",
        "values (#{id,jdbcType=INTEGER}, #{relationship,jdbcType=VARCHAR}, ",
        "#{relationWeigth,jdbcType=INTEGER}, #{appellations,jdbcType=VARCHAR})"
    })
    int insert(Relationship record);

    @InsertProvider(type=RelationshipSqlProvider.class, method="insertSelective")
    int insertSelective(Relationship record);

    @SelectProvider(type=RelationshipSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="relationship", property="relationship", jdbcType=JdbcType.VARCHAR),
        @Result(column="relation_weigth", property="relationWeigth", jdbcType=JdbcType.INTEGER),
        @Result(column="appellations", property="appellations", jdbcType=JdbcType.VARCHAR)
    })
    List<Relationship> selectByExample(RelationshipExample example);

    @Select({
        "select",
        "id, relationship, relation_weigth, appellations",
        "from relationship",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="relationship", property="relationship", jdbcType=JdbcType.VARCHAR),
        @Result(column="relation_weigth", property="relationWeigth", jdbcType=JdbcType.INTEGER),
        @Result(column="appellations", property="appellations", jdbcType=JdbcType.VARCHAR)
    })
    Relationship selectByPrimaryKey(Integer id);

    @UpdateProvider(type=RelationshipSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Relationship record, @Param("example") RelationshipExample example);

    @UpdateProvider(type=RelationshipSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Relationship record, @Param("example") RelationshipExample example);

    @UpdateProvider(type=RelationshipSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Relationship record);

    @Update({
        "update relationship",
        "set relationship = #{relationship,jdbcType=VARCHAR},",
          "relation_weigth = #{relationWeigth,jdbcType=INTEGER},",
          "appellations = #{appellations,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Relationship record);
}