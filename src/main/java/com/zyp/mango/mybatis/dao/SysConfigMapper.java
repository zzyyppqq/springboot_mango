package com.zyp.mango.mybatis.dao;

import com.zyp.mango.mybatis.model.SysConfig;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface SysConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    @Insert({
        "insert into sys_config (id, value, ",
        "label, type, description, ",
        "sort, create_by, ",
        "create_time, last_update_by, ",
        "last_update_time, remarks, ",
        "del_flag)",
        "values (#{id,jdbcType=BIGINT}, #{value,jdbcType=VARCHAR}, ",
        "#{label,jdbcType=VARCHAR}, #{type,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{sort,jdbcType=DECIMAL}, #{createBy,jdbcType=VARCHAR}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{lastUpdateBy,jdbcType=VARCHAR}, ",
        "#{lastUpdateTime,jdbcType=TIMESTAMP}, #{remarks,jdbcType=VARCHAR}, ",
        "#{delFlag,jdbcType=TINYINT})"
    })
    int insert(SysConfig row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    @Select({
        "select",
        "id, value, label, type, description, sort, create_by, create_time, last_update_by, ",
        "last_update_time, remarks, del_flag",
        "from sys_config"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="label", property="label", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="sort", property="sort", jdbcType=JdbcType.DECIMAL),
        @Result(column="create_by", property="createBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_update_by", property="lastUpdateBy", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_update_time", property="lastUpdateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="remarks", property="remarks", jdbcType=JdbcType.VARCHAR),
        @Result(column="del_flag", property="delFlag", jdbcType=JdbcType.TINYINT)
    })
    List<SysConfig> selectAll();
}