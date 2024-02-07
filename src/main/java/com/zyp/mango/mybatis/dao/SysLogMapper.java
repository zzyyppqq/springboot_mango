package com.zyp.mango.mybatis.dao;

import com.zyp.mango.mybatis.model.SysLog;
import java.util.List;

public interface SysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    int insert(SysLog row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    SysLog selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    List<SysLog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    int updateByPrimaryKey(SysLog row);
}