/*
 * $Id: ForeignkeyDefintion.java, 2018年6月6日 下午8:45:25 XiuYu.Ge Exp $
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
 * Title: ForeignkeyDefintion
 * </p>
 * <p>
 * Description:外键
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月6日 下午8:45:25
 * @modified [who date description]
 * @check [who date description]
 */
public class ForeignkeyDefintion extends Definition{

    // 主键表的目录
    private String pkTableCat;

    // 主键表的架构
    private String pkTableSchem;

    // 主键表名
    private String pkTableName;

    // 主键列名
    private String pkColumnName;

    // 外键的表的目录（可能为空）出口（可能为null）
    private String fkTableCat;

    // 外键表的架构（可能为空）出口（可能为空）
    private String fkTableSchem;

    // 外键表名
    private String fkTableName;

    // 外键列名
    private String fkColumnName;

    // 序列号（外键内值1表示第一列的外键，值2代表在第二列的外键）。
    private Short keySeq;

    private Short updateRule;

    private Short delRule;

    // 外键的名称（可能为空）
    private String fkName;

    // 主键的名称（可能为空）
    private String pkName;

    private Short deferRability;

    /**
     * @return the pkTableCat
     */
    public String getPkTableCat() {
        return pkTableCat;
    }

    /**
     * @param pkTableCat
     *            the pkTableCat to set
     */
    public void setPkTableCat(String pkTableCat) {
        this.pkTableCat = pkTableCat;
    }

    /**
     * @return the pkTableSchem
     */
    public String getPkTableSchem() {
        return pkTableSchem;
    }

    /**
     * @param pkTableSchem
     *            the pkTableSchem to set
     */
    public void setPkTableSchem(String pkTableSchem) {
        this.pkTableSchem = pkTableSchem;
    }

    /**
     * @return the pkTableName
     */
    public String getPkTableName() {
        return pkTableName;
    }

    /**
     * @param pkTableName
     *            the pkTableName to set
     */
    public void setPkTableName(String pkTableName) {
        this.pkTableName = pkTableName;
    }

    /**
     * @return the pkColumnName
     */
    public String getPkColumnName() {
        return pkColumnName;
    }

    /**
     * @param pkColumnName
     *            the pkColumnName to set
     */
    public void setPkColumnName(String pkColumnName) {
        this.pkColumnName = pkColumnName;
    }

    /**
     * @return the fkTableCat
     */
    public String getFkTableCat() {
        return fkTableCat;
    }

    /**
     * @param fkTableCat
     *            the fkTableCat to set
     */
    public void setFkTableCat(String fkTableCat) {
        this.fkTableCat = fkTableCat;
    }

    /**
     * @return the fkTableSchem
     */
    public String getFkTableSchem() {
        return fkTableSchem;
    }

    /**
     * @param fkTableSchem
     *            the fkTableSchem to set
     */
    public void setFkTableSchem(String fkTableSchem) {
        this.fkTableSchem = fkTableSchem;
    }

    /**
     * @return the fkTableName
     */
    public String getFkTableName() {
        return fkTableName;
    }

    /**
     * @param fkTableName
     *            the fkTableName to set
     */
    public void setFkTableName(String fkTableName) {
        this.fkTableName = fkTableName;
    }

    /**
     * @return the fkColumnName
     */
    public String getFkColumnName() {
        return fkColumnName;
    }

    /**
     * @param fkColumnName
     *            the fkColumnName to set
     */
    public void setFkColumnName(String fkColumnName) {
        this.fkColumnName = fkColumnName;
    }

    /**
     * @return the keySeq
     */
    public Short getKeySeq() {
        return keySeq;
    }

    /**
     * @param keySeq
     *            the keySeq to set
     */
    public void setKeySeq(Short keySeq) {
        this.keySeq = keySeq;
    }

    /**
     * @return the updateRule
     */
    public Short getUpdateRule() {
        return updateRule;
    }

    /**
     * @param updateRule
     *            the updateRule to set
     */
    public void setUpdateRule(Short updateRule) {
        this.updateRule = updateRule;
    }

    /**
     * @return the delRule
     */
    public Short getDelRule() {
        return delRule;
    }

    /**
     * @param delRule
     *            the delRule to set
     */
    public void setDelRule(Short delRule) {
        this.delRule = delRule;
    }

    /**
     * @return the fkName
     */
    public String getFkName() {
        return fkName;
    }

    /**
     * @param fkName
     *            the fkName to set
     */
    public void setFkName(String fkName) {
        this.fkName = fkName;
    }

    /**
     * @return the pkName
     */
    public String getPkName() {
        return pkName;
    }

    /**
     * @param pkName
     *            the pkName to set
     */
    public void setPkName(String pkName) {
        this.pkName = pkName;
    }

    /**
     * @return the deferRability
     */
    public Short getDeferRability() {
        return deferRability;
    }

    /**
     * @param deferRability
     *            the deferRability to set
     */
    public void setDeferRability(Short deferRability) {
        this.deferRability = deferRability;
    }

    /**
     * 
     */
    public ForeignkeyDefintion() {
        super();
    }

}
