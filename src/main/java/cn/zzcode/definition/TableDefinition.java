/*
 * $Id: TableDefinition.java, 2018年6月6日 下午7:39:11 XiuYu.Ge Exp $
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
 * Title: TableDefinition
 * </p>
 * <p>
 * Description:表属性
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月6日 下午7:39:11
 * @modified [who date description]
 * @check [who date description]
 */
public class TableDefinition extends Definition{

    // 表名
    private String tableName;

    // 表类型
    private String tableType;

    //
    private String remark;

    /**
     * @return the tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param tableName
     *            the tableName to set
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * @return the tableType
     */
    public String getTableType() {
        return tableType;
    }

    /**
     * @param tableType
     *            the tableType to set
     */
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     *            the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 
     */
    public TableDefinition() {
        super();
    }

}
