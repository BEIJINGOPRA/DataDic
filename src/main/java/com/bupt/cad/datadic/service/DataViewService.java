package com.bupt.cad.datadic.service;

import com.bupt.cad.datadic.model.vo.ColumnVO;
import com.bupt.cad.datadic.model.vo.ColumnWithDataVO;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/16:57
 * @Description:
 */
public interface DataViewService {
    Map<String, ColumnWithDataVO> getColumnData(List<String> names) throws IOException;

}
