/*
 * $Id: IndexDefinition.java, 2018年6月6日 下午8:44:08 XiuYu.Ge Exp $
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
 * Title: IndexDefinition
 * </p>
 * <p>
 * Description:索引
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月6日 下午8:44:08
 * @modified [who date description]
 * @check [who date description]
 */
public class IndexDefinition extends Definition {

    // 索引目录（可能为空）
    private String indexQualifier;

    // 索引的名称
    private String indexName;

    // 索引类型
    private Short type;

    // 在索引列顺序号
    private Short ordinalPosition;

    // 列名
    private String columnName;

    // 列排序顺序:升序还是降序
    private String ascOrDesc;

    // 基数
    private Integer cardinality;

    // 非唯一索引
    private Boolean nonUnique;

    /**
     * @return the indexQualifier
     */
    public String getIndexQualifier() {
        return indexQualifier;
    }

    /**
     * @param indexQualifier
     *            the indexQualifier to set
     */
    public void setIndexQualifier(String indexQualifier) {
        this.indexQualifier = indexQualifier;
    }

    /**
     * @return the indexName
     */
    public String getIndexName() {
        return indexName;
    }

    /**
     * @param indexName
     *            the indexName to set
     */
    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    /**
     * @return the type
     */
    public Short getType() {
        return type;
    }

    /**
     * @param type
     *            the type to set
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * @return the ordinalPosition
     */
    public Short getOrdinalPosition() {
        return ordinalPosition;
    }

    /**
     * @param ordinalPosition
     *            the ordinalPosition to set
     */
    public void setOrdinalPosition(Short ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

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
     * @return the ascOrDesc
     */
    public String getAscOrDesc() {
        return ascOrDesc;
    }

    /**
     * @param ascOrDesc
     *            the ascOrDesc to set
     */
    public void setAscOrDesc(String ascOrDesc) {
        this.ascOrDesc = ascOrDesc;
    }

    /**
     * @return the cardinality
     */
    public Integer getCardinality() {
        return cardinality;
    }

    /**
     * @param cardinality
     *            the cardinality to set
     */
    public void setCardinality(Integer cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * @return the nonUnique
     */
    public Boolean getNonUnique() {
        return nonUnique;
    }

    /**
     * @param nonUnique
     *            the nonUnique to set
     */
    public void setNonUnique(Boolean nonUnique) {
        this.nonUnique = nonUnique;
    }

    /**
     * 
     */
    public IndexDefinition() {
        super();
    }

}
