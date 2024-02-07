package com.zyp.mango.mybatis.dao;

import com.zyp.mango.mybatis.model.SysRoleDept;
import java.util.List;

public interface SysRoleDeptMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    int insert(SysRoleDept row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    SysRoleDept selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    List<SysRoleDept> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_role_dept
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    int updateByPrimaryKey(SysRoleDept row);
}