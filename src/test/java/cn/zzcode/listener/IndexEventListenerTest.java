/*
 * $Id: IndexEventListenerTest.java, 2018年6月7日 下午4:16:15 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener;

import cn.zzcode.listener.event.IndexEvent;

/**
 * <p>
 * Title: IndexEventListenerTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午4:16:15
 * @modified [who date description]
 * @check [who date description]
 */
public class IndexEventListenerTest implements IndexEventListener {

    /**
     * @see cn.zzcode.listener.IndexEventListener#Event(cn.zzcode.listener.event.IndexEvent)
     */
    public void Event(IndexEvent event) {
        System.out.println(event.getIndexDefinition().getColumnName());

    }

}
