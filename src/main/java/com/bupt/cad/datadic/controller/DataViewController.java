package com.bupt.cad.datadic.controller;

import com.bupt.cad.datadic.common.ReturnResult;
import com.bupt.cad.datadic.model.po.DataAPI;
import com.bupt.cad.datadic.model.vo.ColumnWithDataVO;
import com.bupt.cad.datadic.model.vo.FirstCategoryVO;
import com.bupt.cad.datadic.model.vo.SecondCategoryVO;
import com.bupt.cad.datadic.service.DataViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/14:28
 * @Description:
 */

@RestController
public class DataViewController {

    @Autowired
    DataViewService dataViewService;

    @GetMapping("/search/data")
    public ReturnResult getDataByKeyword(@RequestParam String keyword,
                                               @RequestParam Integer firstCategory,
                                               @RequestParam(name = "secondCategory",required = false) List<Integer> secondCategorys,
                                               @RequestParam(name = "Apis",required = false) List<Integer> Apis ) throws IOException {
        Map<String,String> resultMap = dataViewService.searchData(keyword,firstCategory,secondCategorys,Apis);
        return new ReturnResult(200,"查询成功",resultMap);
    }

    @GetMapping("/search/firstgory")
    //查询所有的类别
    public ReturnResult getFirstCategory(){
        List<FirstCategoryVO> firstCategoryVOS = dataViewService.getFirstCategory();
        return new ReturnResult(200,firstCategoryVOS);
    }

    @GetMapping("/search/secondgory/{id}")
    //获得某个类别下的所有类别
    public ReturnResult getSecondCategory(@PathVariable Integer id){
        List<SecondCategoryVO> secondCategoryVOS = dataViewService.getSecondCategory(id);
        return new ReturnResult(200,secondCategoryVOS);

    }

    @GetMapping("/search/api")
    //获得API信息,id为第二类别
    public ReturnResult getAPI(@RequestParam Integer id){
        List<DataAPI> dataAPIList = dataViewService.getDataApiByCategory(id);
        return new ReturnResult(200,dataAPIList);
    }

    @GetMapping("/search/column")
    //打勾选择字段
    public  ReturnResult getColumnData(@RequestParam List<Integer> columnIds) throws IOException {
        Map<String,String> resultMap = dataViewService.searchDataById(columnIds);

        return new ReturnResult(200,resultMap);
    }



}
