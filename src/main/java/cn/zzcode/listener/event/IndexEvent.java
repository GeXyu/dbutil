/*
 * $Id: ForeignKeyEvent.java, 2018年6月7日 下午12:01:55 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener.event;

import cn.zzcode.definition.DataBaseDefinition;
import cn.zzcode.definition.IndexDefinition;
import cn.zzcode.definition.TableDefinition;

/**
 * <p>
 * Title: ForeignKeyEvent
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午12:01:55
 * @modified [who date description]
 * @check [who date description]
 */
public class IndexEvent extends TableEvent {

    private IndexDefinition indexDefinition;

    /**
     * @return the indexDefinition
     */
    public IndexDefinition getIndexDefinition() {
        return indexDefinition;
    }

    /**
     * @param indexDefinition
     *            the indexDefinition to set
     */
    public void setIndexDefinition(IndexDefinition indexDefinition) {
        this.indexDefinition = indexDefinition;
    }

    /**
     * @param dataBaseDefinition
     * @param tableDefinition
     */
    public IndexEvent(DataBaseDefinition dataBaseDefinition, TableDefinition tableDefinition,
            IndexDefinition indexDefinition) {
        super(dataBaseDefinition, tableDefinition);
        this.indexDefinition = indexDefinition;
    }

}
