package com.bupt.cad.datadic.service;

import com.bupt.cad.datadic.common.ReturnResult;
import com.bupt.cad.datadic.model.datasource.BaseDataSource;
import com.bupt.cad.datadic.model.po.DataSource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/10:20
 * @Description:
 */
public interface DataSourceService {

    boolean testConnection(DataSource dataSource);

    BaseDataSource saveDataSource(DataSource dataSource);

    int updateDataSource(DataSource dataSource);

}
