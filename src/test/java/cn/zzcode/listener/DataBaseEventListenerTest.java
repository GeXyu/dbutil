/*
 * $Id: DataBaseEventListenerTest.java, 2018年6月7日 下午12:59:14 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.listener;

import cn.zzcode.listener.event.DataBaseEvent;

/**
 * <p>
 * Title: DataBaseEventListenerTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午12:59:14
 * @modified [who date description]
 * @check [who date description]
 */
public class DataBaseEventListenerTest implements DataBaseEventListener {

    /**
     * @see cn.zzcode.listener.DataBaseEventListener#event(cn.zzcode.listener.event.DataBaseEvent)
     */
    public void event(DataBaseEvent event) {
        System.out.println(event.getDataBaseDefinition().getUserName());

    }

}
