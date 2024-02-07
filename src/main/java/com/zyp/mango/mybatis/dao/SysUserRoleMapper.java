package com.zyp.mango.mybatis.dao;

import com.zyp.mango.mybatis.model.SysUserRole;
import java.util.List;

public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    int insert(SysUserRole row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    SysUserRole selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    List<SysUserRole> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Wed Feb 07 16:11:04 CST 2024
     */
    int updateByPrimaryKey(SysUserRole row);
}