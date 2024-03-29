package com.zyp.mango.mybatis.model;

import java.util.Date;

public class SysRoleDept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.role_id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private Long roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.dept_id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private Long deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.create_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.create_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.last_update_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_role_dept.last_update_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.id
     *
     * @return the value of sys_role_dept.id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.id
     *
     * @param id the value for sys_role_dept.id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.role_id
     *
     * @return the value of sys_role_dept.role_id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.role_id
     *
     * @param roleId the value for sys_role_dept.role_id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.dept_id
     *
     * @return the value of sys_role_dept.dept_id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public Long getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.dept_id
     *
     * @param deptId the value for sys_role_dept.dept_id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.create_by
     *
     * @return the value of sys_role_dept.create_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.create_by
     *
     * @param createBy the value for sys_role_dept.create_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.create_time
     *
     * @return the value of sys_role_dept.create_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.create_time
     *
     * @param createTime the value for sys_role_dept.create_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.last_update_by
     *
     * @return the value of sys_role_dept.last_update_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.last_update_by
     *
     * @param lastUpdateBy the value for sys_role_dept.last_update_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_role_dept.last_update_time
     *
     * @return the value of sys_role_dept.last_update_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_role_dept.last_update_time
     *
     * @param lastUpdateTime the value for sys_role_dept.last_update_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}