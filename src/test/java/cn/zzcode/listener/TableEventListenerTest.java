/*
 * $Id: TableEventListenerTest.java, 2018年6月7日 下午1:01:26 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener;

import cn.zzcode.listener.event.TableEvent;

/**
 * <p>
 * Title: TableEventListenerTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午1:01:26
 * @modified [who date description]
 * @check [who date description]
 */
public class TableEventListenerTest implements TableEventListener {

    /**
     * @see cn.zzcode.listener.TableEventListener#event(cn.zzcode.listener.event.TableEvent)
     */
    public void event(TableEvent event) {
        System.out.println(event.getTableDefinition().getTableName());

    }

}
