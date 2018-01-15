package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.YuhunType;
import demo.hugh.mvc.po.YuhunTypeExample;
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

public interface YuhunTypeMapper {
    @SelectProvider(type=YuhunTypeSqlProvider.class, method="countByExample")
    long countByExample(YuhunTypeExample example);

    @DeleteProvider(type=YuhunTypeSqlProvider.class, method="deleteByExample")
    int deleteByExample(YuhunTypeExample example);

    @Delete({
        "delete from yuhun_type",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into yuhun_type (id, name, ",
        "buff2, buff4)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{buff2,jdbcType=VARCHAR}, #{buff4,jdbcType=VARCHAR})"
    })
    int insert(YuhunType record);

    @InsertProvider(type=YuhunTypeSqlProvider.class, method="insertSelective")
    int insertSelective(YuhunType record);

    @SelectProvider(type=YuhunTypeSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="buff2", property="buff2", jdbcType=JdbcType.VARCHAR),
        @Result(column="buff4", property="buff4", jdbcType=JdbcType.VARCHAR)
    })
    List<YuhunType> selectByExample(YuhunTypeExample example);

    @Select({
        "select",
        "id, name, buff2, buff4",
        "from yuhun_type",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="buff2", property="buff2", jdbcType=JdbcType.VARCHAR),
        @Result(column="buff4", property="buff4", jdbcType=JdbcType.VARCHAR)
    })
    YuhunType selectByPrimaryKey(String id);

    @UpdateProvider(type=YuhunTypeSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") YuhunType record, @Param("example") YuhunTypeExample example);

    @UpdateProvider(type=YuhunTypeSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") YuhunType record, @Param("example") YuhunTypeExample example);

    @UpdateProvider(type=YuhunTypeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(YuhunType record);

    @Update({
        "update yuhun_type",
        "set name = #{name,jdbcType=VARCHAR},",
          "buff2 = #{buff2,jdbcType=VARCHAR},",
          "buff4 = #{buff4,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(YuhunType record);
}