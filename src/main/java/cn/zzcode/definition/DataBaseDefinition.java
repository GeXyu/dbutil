/*
 * $Id: DataBaseDefinition.java, 2018年6月6日 下午8:24:38 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.definition;

/**
 * <p>
 * Title: DataBaseDefinition
 * </p>
 * <p>
 * Description:数据库信息
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月6日 下午8:24:38
 * @modified [who date description]
 * @check [who date description]
 */
public class DataBaseDefinition extends Definition{

    // 用户
    private String userName;

    // 系统函数的逗号分隔列表
    private String systemFunctions;

    // 时间和日期函数的逗号分隔列表
    private String timeDateFunctions;

    // 字符串函数的逗号分隔列表
    private String stringFunctions;

    // 供应商用于 'schema' 的首选术语
    private String schemaTerm;

    // url
    private String URL;

    // 是否只读
    private Boolean ReadOnly;

    // 产品名称
    private String databaseProductName;

    // 数据库的版本
    private String databaseProductVersion;

    // 驱动程序的名称
    private String driverName;

    // 驱动程序版本
    private String driverVersion;

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     *            the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the systemFunctions
     */
    public String getSystemFunctions() {
        return systemFunctions;
    }

    /**
     * @param systemFunctions
     *            the systemFunctions to set
     */
    public void setSystemFunctions(String systemFunctions) {
        this.systemFunctions = systemFunctions;
    }

    /**
     * @return the timeDateFunctions
     */
    public String getTimeDateFunctions() {
        return timeDateFunctions;
    }

    /**
     * @param timeDateFunctions
     *            the timeDateFunctions to set
     */
    public void setTimeDateFunctions(String timeDateFunctions) {
        this.timeDateFunctions = timeDateFunctions;
    }

    /**
     * @return the stringFunctions
     */
    public String getStringFunctions() {
        return stringFunctions;
    }

    /**
     * @param stringFunctions
     *            the stringFunctions to set
     */
    public void setStringFunctions(String stringFunctions) {
        this.stringFunctions = stringFunctions;
    }

    /**
     * @return the schemaTerm
     */
    public String getSchemaTerm() {
        return schemaTerm;
    }

    /**
     * @param schemaTerm
     *            the schemaTerm to set
     */
    public void setSchemaTerm(String schemaTerm) {
        this.schemaTerm = schemaTerm;
    }

    /**
     * @return the uRL
     */
    public String getURL() {
        return URL;
    }

    /**
     * @param uRL
     *            the uRL to set
     */
    public void setURL(String uRL) {
        URL = uRL;
    }

    /**
     * @return the readOnly
     */
    public Boolean getReadOnly() {
        return ReadOnly;
    }

    /**
     * @param readOnly
     *            the readOnly to set
     */
    public void setReadOnly(Boolean readOnly) {
        ReadOnly = readOnly;
    }

    /**
     * @return the databaseProductName
     */
    public String getDatabaseProductName() {
        return databaseProductName;
    }

    /**
     * @param databaseProductName
     *            the databaseProductName to set
     */
    public void setDatabaseProductName(String databaseProductName) {
        this.databaseProductName = databaseProductName;
    }

    /**
     * @return the databaseProductVersion
     */
    public String getDatabaseProductVersion() {
        return databaseProductVersion;
    }

    /**
     * @param databaseProductVersion
     *            the databaseProductVersion to set
     */
    public void setDatabaseProductVersion(String databaseProductVersion) {
        this.databaseProductVersion = databaseProductVersion;
    }

    /**
     * @return the driverName
     */
    public String getDriverName() {
        return driverName;
    }

    /**
     * @param driverName
     *            the driverName to set
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    /**
     * @return the driverVersion
     */
    public String getDriverVersion() {
        return driverVersion;
    }

    /**
     * @param driverVersion
     *            the driverVersion to set
     */
    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    /**
     * 
     */
    public DataBaseDefinition() {
        super();
    }

}
