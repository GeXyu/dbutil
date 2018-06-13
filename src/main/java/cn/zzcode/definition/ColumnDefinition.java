/*
 * $Id: ColumnDefinition.java, 2018年6月6日 下午7:40:04 XiuYu.Ge Exp $
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
 * Title: ColumnDefinition
 * </p>
 * <p>
 * Description:列属性
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月6日 下午7:40:04
 * @modified [who date description]
 * @check [who date description]
 */
public class ColumnDefinition extends Definition{

    // 表目录
    private String tableCat;

    // 表架构
    private String tableSchem;

    // 表明
    private String tableName;

    // 列名
    private String colnumName;

    // int dataType = columns.getInt("DATA_TYPE"); // 对应的java.sql.Types类型
    private Integer dataType;

    /// java.sql.Types类型
    private String dataTypeName;

    // 列大小
    private Integer columnSize;

    // 小数位数
    private Integer decimalDigits;

    // 基数
    private Integer numPrecRadix;

    // 是否允许为null
    private Integer nullAble;

    // 列描述
    private String remark;

    // 默认值
    private String columnDef;

    // sql数据类型
    private Integer sqlDataType;

    // SQL日期时间分?
    private Integer sqlDatetimeSub;

    // char类型的列中的最大字节数
    private Integer charOctetLength;

    // 表中列的索引（从1开始）
    private Integer ordinalPosition;

    // ISO规则用来确定某一列的为空性
    private String isNullAble;

    // 指示此列是否是自动递增 是
    private String isAutoincrement;

    /**
     * @return the tableCat
     */
    public String getTableCat() {
        return tableCat;
    }

    /**
     * @param tableCat
     *            the tableCat to set
     */
    public void setTableCat(String tableCat) {
        this.tableCat = tableCat;
    }

    /**
     * @return the tableSchem
     */
    public String getTableSchem() {
        return tableSchem;
    }

    /**
     * @param tableSchem
     *            the tableSchem to set
     */
    public void setTableSchem(String tableSchem) {
        this.tableSchem = tableSchem;
    }

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
     * @return the colnumName
     */
    public String getColnumName() {
        return colnumName;
    }

    /**
     * @param colnumName
     *            the colnumName to set
     */
    public void setColnumName(String colnumName) {
        this.colnumName = colnumName;
    }

    /**
     * @return the dataType
     */
    public Integer getDataType() {
        return dataType;
    }

    /**
     * @param dataType
     *            the dataType to set
     */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    /**
     * @return the dataTypeName
     */
    public String getDataTypeName() {
        return dataTypeName;
    }

    /**
     * @param dataTypeName
     *            the dataTypeName to set
     */
    public void setDataTypeName(String dataTypeName) {
        this.dataTypeName = dataTypeName;
    }

    /**
     * @return the columnSize
     */
    public Integer getColumnSize() {
        return columnSize;
    }

    /**
     * @param columnSize
     *            the columnSize to set
     */
    public void setColumnSize(Integer columnSize) {
        this.columnSize = columnSize;
    }

    /**
     * @return the decimalDigits
     */
    public Integer getDecimalDigits() {
        return decimalDigits;
    }

    /**
     * @param decimalDigits
     *            the decimalDigits to set
     */
    public void setDecimalDigits(Integer decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

    /**
     * @return the numPrecRadix
     */
    public Integer getNumPrecRadix() {
        return numPrecRadix;
    }

    /**
     * @param numPrecRadix
     *            the numPrecRadix to set
     */
    public void setNumPrecRadix(Integer numPrecRadix) {
        this.numPrecRadix = numPrecRadix;
    }

    /**
     * @return the nullAble
     */
    public Integer getNullAble() {
        return nullAble;
    }

    /**
     * @param nullAble
     *            the nullAble to set
     */
    public void setNullAble(Integer nullAble) {
        this.nullAble = nullAble;
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
     * @return the columnDef
     */
    public String getColumnDef() {
        return columnDef;
    }

    /**
     * @param columnDef
     *            the columnDef to set
     */
    public void setColumnDef(String columnDef) {
        this.columnDef = columnDef;
    }

    /**
     * @return the sqlDataType
     */
    public Integer getSqlDataType() {
        return sqlDataType;
    }

    /**
     * @param sqlDataType
     *            the sqlDataType to set
     */
    public void setSqlDataType(Integer sqlDataType) {
        this.sqlDataType = sqlDataType;
    }

    /**
     * @return the sqlDatetimeSub
     */
    public Integer getSqlDatetimeSub() {
        return sqlDatetimeSub;
    }

    /**
     * @param sqlDatetimeSub
     *            the sqlDatetimeSub to set
     */
    public void setSqlDatetimeSub(Integer sqlDatetimeSub) {
        this.sqlDatetimeSub = sqlDatetimeSub;
    }

    /**
     * @return the charOctetLength
     */
    public Integer getCharOctetLength() {
        return charOctetLength;
    }

    /**
     * @param charOctetLength
     *            the charOctetLength to set
     */
    public void setCharOctetLength(Integer charOctetLength) {
        this.charOctetLength = charOctetLength;
    }

    /**
     * @return the ordinalPosition
     */
    public Integer getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * @param ordinalPosition
     *            the ordinalPosition to set
     */
    public void setOrdinalPosition(Integer ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    /**
     * @return the isNullAble
     */
    public String getIsNullAble() {
        return isNullAble;
    }

    /**
     * @param isNullAble
     *            the isNullAble to set
     */
    public void setIsNullAble(String isNullAble) {
        this.isNullAble = isNullAble;
    }

    /**
     * @return the isAutoincrement
     */
    public String getIsAutoincrement() {
        return isAutoincrement;
    }

    /**
     * @param isAutoincrement
     *            the isAutoincrement to set
     */
    public void setIsAutoincrement(String isAutoincrement) {
        this.isAutoincrement = isAutoincrement;
    }

    /**
     * 
     */
    public ColumnDefinition() {
        super();
    }

}
