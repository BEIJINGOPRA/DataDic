package com.bupt.cad.datadic.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bupt.cad.datadic.model.po.Column;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/11:21
 * @Description:
 */
@Mapper
public interface ColumnMapper extends BaseMapper<Column> {
    String  selectByName(String name);

}
