/*
 * $Id: DefinitionReader.java, 2018年6月7日 上午8:41:44 XiuYu.Ge Exp $
 * 
 * Copyright (c) 2012 Vnierlai Technologies Co.,Ltd 
 * All rights reserved.
 * 
 * This software is copyrighted and owned by Vnierlai or the copyright holder
 * specified, unless otherwise noted, and may not be reproduced or distributed
 * in whole or in part in any form or medium without express written permission.
 */
package cn.zzcode.reader;

import java.sql.ResultSet;

import cn.zzcode.definition.Definition;

/**
 * <p>
 * Title: DefinitionReader
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author XiuYu.Ge
 * @created 2018年6月7日 上午8:41:44
 * @modified [who date description]
 * @check [who date description]
 */
public interface DefinitionReader {

    /**
     * 
     * @param rs
     * @return
     */
    Definition read(ResultSet rs);

}
