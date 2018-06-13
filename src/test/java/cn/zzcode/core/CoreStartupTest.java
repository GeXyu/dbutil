/*
 * $Id: CoreStartupTest.java, 2018年6月7日 下午12:58:14 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.core;

import cn.zzcode.listener.IndexEventListenerTest;

/**
 * <p>
 * Title: CoreStartupTest
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 下午12:58:14
 * @modified [who date description]
 * @check [who date description]
 */
public class CoreStartupTest {

    public static void main(String[] args) {
        CoreStartup coreStartup = CoreStartupFactory.getInstance();
        // coreStartup.addListener(new DataBaseEventListenerTest());
        // coreStartup.addListener(new TableEventListenerTest());
        // coreStartup.addListener(new ViewEventListenerTest());
        // coreStartup.addListener(new ColumnEventListenerTest());
        // coreStartup.addListener(new PrimaryKeyEventListenerTest());

        // coreStartup.addListener(new ForeignKeyEventListenerTest());
        coreStartup.addListener(new IndexEventListenerTest());
        coreStartup.run();

    }
}
