package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Area;
import demo.hugh.mvc.po.AreaExample;
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

public interface AreaMapper {
    @SelectProvider(type=AreaSqlProvider.class, method="countByExample")
    int countByExample(AreaExample example);

    @DeleteProvider(type=AreaSqlProvider.class, method="deleteByExample")
    int deleteByExample(AreaExample example);

    @Delete({
        "delete from area",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into area (id, area_code, ",
        "name, father_code)",
        "values (#{id,jdbcType=INTEGER}, #{areaCode,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{fatherCode,jdbcType=INTEGER})"
    })
    int insert(Area record);

    @InsertProvider(type=AreaSqlProvider.class, method="insertSelective")
    int insertSelective(Area record);

    @SelectProvider(type=AreaSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="area_code", property="areaCode", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="father_code", property="fatherCode", jdbcType=JdbcType.INTEGER)
    })
    List<Area> selectByExample(AreaExample example);

    @Select({
        "select",
        "id, area_code, name, father_code",
        "from area",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="area_code", property="areaCode", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="father_code", property="fatherCode", jdbcType=JdbcType.INTEGER)
    })
    Area selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AreaSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Area record, @Param("example") AreaExample example);

    @UpdateProvider(type=AreaSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Area record, @Param("example") AreaExample example);

    @UpdateProvider(type=AreaSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Area record);

    @Update({
        "update area",
        "set area_code = #{areaCode,jdbcType=INTEGER},",
          "name = #{name,jdbcType=VARCHAR},",
          "father_code = #{fatherCode,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Area record);
}