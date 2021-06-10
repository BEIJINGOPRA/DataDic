package com.bupt.cad.datadic.service.impl;

import com.bupt.cad.datadic.dao.ColumnMapper;
import com.bupt.cad.datadic.http.APIUrl;
import com.bupt.cad.datadic.http.HttpUtil;
import com.bupt.cad.datadic.http.ReturnData;
import com.bupt.cad.datadic.model.vo.ColumnVO;
import com.bupt.cad.datadic.model.vo.ColumnWithDataVO;
import com.bupt.cad.datadic.service.DataViewService;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.common.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/16:57
 * @Description:
 */

@Service
public class DataViewServiceImpl implements DataViewService {

    @Autowired
    ColumnMapper columnMapper;


    public String[] getRealName(String name) {
        String realName = columnMapper.selectByName(name);
        String[] realNames = realName.split(",");
        return realNames;
    }


    public String[] getPortAndAPI(String name) {
        String portAndAPI = columnMapper.selectByName(name);
        String[] portAndAPIs = portAndAPI.split(",");
        return portAndAPIs;
    }

    @Override
    public Map<String, ColumnWithDataVO> getColumnData(List<String> names) throws IOException {
        Map<String, ColumnWithDataVO> columnVOMap = new LinkedHashMap<>();
        for(String name : names){
            String[] realNames = getRealName(name);
            String[] portAndAPIs = getPortAndAPI(name);
            for(String url : portAndAPIs){
                APIUrl apiUrl = new APIUrl(url);
                HttpRequest request = HttpUtil.HTTP_REQUEST_FACTORY.buildGetRequest(apiUrl);
                HttpHeaders headers = request.getHeaders();
                //在请求头中设置token
                headers.setAuthorization("token");
                //设置type
                Type type = new TypeToken<ReturnData>(){}.getType();
                //执行查询请求
                ReturnData returnData = (ReturnData) request.execute().parseAs(type);
                //
                returnData.set("data",returnData.get(name));
                //记录data信息
                List<Object> columnData = columnVOMap.get(name).getData();
                columnData.add(returnData.get("data"));
            }




        }
        return null;
    }
}
