package com.bupt.cad.datadic.service.impl;

import com.bupt.cad.datadic.common.ReturnResult;
import com.bupt.cad.datadic.dao.DataSourceMapper;
import com.bupt.cad.datadic.model.datasource.BaseDataSource;
import com.bupt.cad.datadic.model.po.DataSource;
import com.bupt.cad.datadic.service.DataSourceService;
import com.bupt.cad.datadic.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/10:26
 * @Description:
 */

@Service
public class DataSourceServiceImpl implements DataSourceService {

    @Autowired
    DataSourceMapper dataSourceMapper;

    @Override
    public boolean testConnection(DataSource dataSource) {
        BaseDataSource baseDataSource = DataSourceUtil.convertToBaseDataSource(dataSource);
        boolean res = baseDataSource.testConnection();
        return res;
    }

    @Override
    public BaseDataSource saveDataSource(DataSource dataSource) {
        dataSourceMapper.insert(dataSource);
        BaseDataSource baseDataSource = DataSourceUtil.convertToBaseDataSource(dataSource);
        return baseDataSource;
    }

    @Override
    public int updateDataSource(DataSource dataSource) {
        int res = dataSourceMapper.updateByPrimaryKeySelective(dataSource);
        return res;
    }
}
