package com.zyp.mango.mybatis.model;

import java.util.Date;

public class SysLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.user_name
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.operation
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private String operation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.method
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private String method;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.params
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private String params;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private Long time;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.ip
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.create_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.create_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.last_update_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.last_update_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.id
     *
     * @return the value of sys_log.id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.id
     *
     * @param id the value for sys_log.id
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.user_name
     *
     * @return the value of sys_log.user_name
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.user_name
     *
     * @param userName the value for sys_log.user_name
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.operation
     *
     * @return the value of sys_log.operation
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.operation
     *
     * @param operation the value for sys_log.operation
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.method
     *
     * @return the value of sys_log.method
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.method
     *
     * @param method the value for sys_log.method
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.params
     *
     * @return the value of sys_log.params
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public String getParams() {
        return params;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.params
     *
     * @param params the value for sys_log.params
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setParams(String params) {
        this.params = params == null ? null : params.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.time
     *
     * @return the value of sys_log.time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public Long getTime() {
        return time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.time
     *
     * @param time the value for sys_log.time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setTime(Long time) {
        this.time = time;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.ip
     *
     * @return the value of sys_log.ip
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.ip
     *
     * @param ip the value for sys_log.ip
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.create_by
     *
     * @return the value of sys_log.create_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.create_by
     *
     * @param createBy the value for sys_log.create_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.create_time
     *
     * @return the value of sys_log.create_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.create_time
     *
     * @param createTime the value for sys_log.create_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.last_update_by
     *
     * @return the value of sys_log.last_update_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.last_update_by
     *
     * @param lastUpdateBy the value for sys_log.last_update_by
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.last_update_time
     *
     * @return the value of sys_log.last_update_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.last_update_time
     *
     * @param lastUpdateTime the value for sys_log.last_update_time
     *
     * @mbg.generated Wed Feb 07 17:11:34 CST 2024
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}