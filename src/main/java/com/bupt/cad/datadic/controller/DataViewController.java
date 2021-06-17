package com.bupt.cad.datadic.controller;

import com.bupt.cad.datadic.common.ReturnResult;
import com.bupt.cad.datadic.model.vo.ColumnWithDataVO;
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

    @GetMapping("search/firstgory")
    public ReturnResult getFirstCategory(){
        return new ReturnResult();
    }

    @GetMapping("search/secondgory/{id}")
    public ReturnResult getSecondCategory(@PathVariable Integer id){
        return new ReturnResult();

    }



}
