package com.bupt.cad.datadic.controller;

import com.alibaba.fastjson.JSON;
import com.bupt.cad.datadic.common.ReturnResult;
import com.bupt.cad.datadic.model.datasource.BaseDataSource;
import com.bupt.cad.datadic.model.dto.DataSourceDTO;
import com.bupt.cad.datadic.model.po.DataSource;
import com.bupt.cad.datadic.service.DataSourceService;
import com.bupt.cad.datadic.util.DataSourceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/11:10
 * @Description:
 */
@RestController
public class DataSourceController {
    @Autowired
    private DataSourceService dataSourceService;

    @PostMapping("/datasources/insert")
    public ReturnResult saveDataSource(@RequestBody DataSourceDTO dataSourceDTO){


        DataSource dataSource = new DataSource();
        dataSource.setName(dataSourceDTO.getName());
        dataSource.setDescription(dataSourceDTO.getDescription());
        dataSource.setType(dataSourceDTO.getType());
        dataSource.setDetailInfo(JSON.toJSONString(dataSourceDTO.getDetail_info()));
        BaseDataSource baseDataSource = dataSourceService.saveDataSource(dataSource);
        return new ReturnResult(0,"操作成功");

    }

    @PostMapping("/datesources/connection")
    public ReturnResult testConnection(@RequestBody DataSourceDTO dataSourceDTO){

        DataSource dataSource = DataSourceUtil.dataSourceDTOConvert(dataSourceDTO);
        boolean res =dataSourceService.testConnection(dataSource);
        if(res){
            return new ReturnResult(0,"测试成功");
        }else {
            return new ReturnResult(400,"测试失败");
        }
    }
}
