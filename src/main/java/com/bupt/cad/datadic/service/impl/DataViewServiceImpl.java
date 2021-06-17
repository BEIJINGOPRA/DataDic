package com.bupt.cad.datadic.service.impl;

import com.bupt.cad.datadic.dao.ColumnMapper;
import com.bupt.cad.datadic.dao.DataAPIMapper;
import com.bupt.cad.datadic.dao.FirstCategoryMapper;
import com.bupt.cad.datadic.dao.SecondCategoryMapper;
import com.bupt.cad.datadic.http.APIUrl;
import com.bupt.cad.datadic.http.HttpUtil;
import com.bupt.cad.datadic.model.po.DataAPI;
import com.bupt.cad.datadic.model.po.SecondCategory;
import com.bupt.cad.datadic.model.vo.FirstCategoryVO;
import com.bupt.cad.datadic.model.vo.SecondCategoryVO;
import com.bupt.cad.datadic.service.DataViewService;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

/**
 * Created with IntelliJ IDEA.c
 *
 * @Author: yuejie
 * @Date: 2021/06/09/16:57
 * @Description:
 */

@Service
public class DataViewServiceImpl implements DataViewService {

    @Autowired
    ColumnMapper columnMapper;

    @Autowired
    DataAPIMapper dataAPIMapper;

    @Autowired
    SecondCategoryMapper secondCategoryMapper;

    @Autowired
    FirstCategoryMapper firstCategoryMapper;

    @Override
    public List<DataAPI> getAllDataAPI() {
        List<DataAPI> dataAPIList = dataAPIMapper.selectAll();
        return dataAPIList;
    }

    @Override
    public Map<String, String> searchData(String keyword,
                                          Integer firstCategory,
                                          List<Integer> secondCategory,
                                          List<Integer> Apis) throws IOException {
        Map<String,String> resultMap = new HashMap<>();
        //选择Api
        if(Apis != null){
            for(int id : Apis){
                DataAPI dataAPI = dataAPIMapper.selectById(id);
                String content = httpRequest(dataAPI,keyword);
                resultMap.put(dataAPI.getApiName(),content);
            }
            //未指定Api，两种情况，指定secondCategory未指定API，secondCategory和Api都未指定
        }else {
            if(secondCategory != null){
                resultMap = getDataBySecondCategory(keyword,secondCategory);
            }else {
                resultMap = getDataByfirstCategory(keyword,firstCategory);

            }
        }
        return resultMap;
    }
    public String httpRequest(DataAPI dataAPI,String keyword) throws IOException {
        String url = dataAPI.getApiUrl()+"?"+keyword;
        APIUrl apiUrl = new APIUrl(url);
        HttpRequest request = HttpUtil.HTTP_REQUEST_FACTORY.buildGetRequest(apiUrl);
        HttpHeaders headers = request.getHeaders();
        headers.setAuthorization("token");
        HttpResponse httpResponse = request.execute();
        String content = httpResponse.parseAsString();
        return content;
    }

    public Map<String,String> getDataBySecondCategory(String keyword,List<Integer> secondCategory) throws IOException {
        Map<String,String> resultMap = new HashMap<>();
        for(int id : secondCategory){
            List<DataAPI> dataAPIList = dataAPIMapper.selectBySecondCategoryId(id);
            for(DataAPI dataAPI : dataAPIList){
                String content = httpRequest(dataAPI,keyword);
                resultMap.put(dataAPI.getApiName(),content);
            }
        }
        return resultMap;
    }
    public Map<String,String> getDataByfirstCategory(String keyword,Integer id) throws IOException {
        Map<String,String> resultMap = new HashMap<>();
        Map<String,Object> columnMap = new HashMap<>();
        columnMap.put("first_category_id",id);
        List<SecondCategory> secondCategoryList = secondCategoryMapper.selectByMap(columnMap);
        List<Integer> idList = new ArrayList<>();
        for(SecondCategory secondCategory : secondCategoryList){
            idList.add(secondCategory.getId());
        }
        resultMap = getDataBySecondCategory(keyword,idList);

        return resultMap;
    }

    @Override
    public List<DataAPI> getDataApiByCategory(Integer id) {
        List<DataAPI> dataAPIList = dataAPIMapper.selectBySecondCategoryId(id);
        return dataAPIList;
    }

    @Override
    public List<FirstCategoryVO> getFirstCategory() {
        List<FirstCategoryVO> firstCategoryVOS = firstCategoryMapper.selectAll();
        return null;
    }

    @Override
    public List<SecondCategoryVO> getSecondCategory(Integer id) {
        return null;
    }
}
