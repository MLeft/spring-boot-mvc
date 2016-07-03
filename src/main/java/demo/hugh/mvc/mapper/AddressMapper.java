package demo.hugh.mvc.mapper;

import demo.hugh.mvc.po.Address;
import demo.hugh.mvc.po.AddressExample;
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

public interface AddressMapper {
    @SelectProvider(type=AddressSqlProvider.class, method="countByExample")
    int countByExample(AddressExample example);

    @DeleteProvider(type=AddressSqlProvider.class, method="deleteByExample")
    int deleteByExample(AddressExample example);

    @Delete({
        "delete from address",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into address (id, user_id, ",
        "country, province, ",
        "city, county, address, ",
        "begin_date, end_date)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{country,jdbcType=INTEGER}, #{province,jdbcType=INTEGER}, ",
        "#{city,jdbcType=INTEGER}, #{county,jdbcType=INTEGER}, #{address,jdbcType=VARCHAR}, ",
        "#{beginDate,jdbcType=DATE}, #{endDate,jdbcType=DATE})"
    })
    int insert(Address record);

    @InsertProvider(type=AddressSqlProvider.class, method="insertSelective")
    int insertSelective(Address record);

    @SelectProvider(type=AddressSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="country", property="country", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.INTEGER),
        @Result(column="city", property="city", jdbcType=JdbcType.INTEGER),
        @Result(column="county", property="county", jdbcType=JdbcType.INTEGER),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_date", property="beginDate", jdbcType=JdbcType.DATE),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.DATE)
    })
    List<Address> selectByExample(AddressExample example);

    @Select({
        "select",
        "id, user_id, country, province, city, county, address, begin_date, end_date",
        "from address",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="country", property="country", jdbcType=JdbcType.INTEGER),
        @Result(column="province", property="province", jdbcType=JdbcType.INTEGER),
        @Result(column="city", property="city", jdbcType=JdbcType.INTEGER),
        @Result(column="county", property="county", jdbcType=JdbcType.INTEGER),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="begin_date", property="beginDate", jdbcType=JdbcType.DATE),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.DATE)
    })
    Address selectByPrimaryKey(Integer id);

    @UpdateProvider(type=AddressSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Address record, @Param("example") AddressExample example);

    @UpdateProvider(type=AddressSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Address record, @Param("example") AddressExample example);

    @UpdateProvider(type=AddressSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Address record);

    @Update({
        "update address",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "country = #{country,jdbcType=INTEGER},",
          "province = #{province,jdbcType=INTEGER},",
          "city = #{city,jdbcType=INTEGER},",
          "county = #{county,jdbcType=INTEGER},",
          "address = #{address,jdbcType=VARCHAR},",
          "begin_date = #{beginDate,jdbcType=DATE},",
          "end_date = #{endDate,jdbcType=DATE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Address record);
}