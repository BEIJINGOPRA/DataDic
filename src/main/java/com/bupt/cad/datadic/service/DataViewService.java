package com.bupt.cad.datadic.service;

import com.bupt.cad.datadic.model.po.Column;
import com.bupt.cad.datadic.model.po.DataAPI;
import com.bupt.cad.datadic.model.po.FirstCategory;
import com.bupt.cad.datadic.model.vo.ColumnVO;
import com.bupt.cad.datadic.model.vo.ColumnWithDataVO;
import com.bupt.cad.datadic.model.vo.FirstCategoryVO;
import com.bupt.cad.datadic.model.vo.SecondCategoryVO;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/16:57
 * @Description:
 */
public interface DataViewService {

    List<DataAPI> getAllDataAPI();

    //以关键字的形式查询数据
    Map<String,String> searchData(String keyword,
                                  Integer firstCategory,
                                  List<Integer> secondCategory,
                                  List<Integer> Apis) throws IOException;
    //通过类别获得相应的API
    List<DataAPI> getDataApiByCategory(Integer id);

    //获得所有的第一类别
    List<FirstCategoryVO> getFirstCategory();

    //通过firstCategoryId活得所有的 第二类别
    List<SecondCategoryVO> getSecondCategory(Integer id);

    Map<String,String> searchDataById(List<Integer> ids) throws IOException;

}
