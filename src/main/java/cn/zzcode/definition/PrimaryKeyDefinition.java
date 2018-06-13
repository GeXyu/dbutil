/*
 * $Id: PrimaryKeyDefinition.java, 2018年6月6日 下午8:44:30 XiuYu.Ge Exp $
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
 * Title: PrimaryKeyDefinition
 * </p>
 * <p>
 * Description:主键
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月6日 下午8:44:30
 * @modified [who date description]
 * @check [who date description]
 */
public class PrimaryKeyDefinition extends Definition{

    // 列名
    private String columnName;

    // 序列号(主键内值1表示第一列的主键，值2代表主键内的第二列)
    private Short keySeq;

    // 主键名称
    private String pkName;

    /**
     * @return the columnName
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param columnName
     *            the columnName to set
     */
    public void setColumnName(String columnName) {
        this.columnName = columnName;
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
     * 
     */
    public PrimaryKeyDefinition() {
        super();
    }

}
