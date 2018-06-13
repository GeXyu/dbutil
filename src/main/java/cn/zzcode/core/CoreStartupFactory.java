/*
 * $Id: CoreStartupFactory.java, 2018年6月13日 上午10:36:38 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.core;

/**
 * <p>
 * Title: CoreStartupFactory
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月13日 上午10:36:38
 * @modified [who date description]
 * @check [who date description]
 */
public class CoreStartupFactory {
    
    public static CoreStartup getInstance() {
        return new CoreStartup();
    }

}
