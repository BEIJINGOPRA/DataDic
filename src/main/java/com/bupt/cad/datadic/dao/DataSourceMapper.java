package com.bupt.cad.datadic.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bupt.cad.datadic.model.po.DataSource;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/10:53
 * @Description:
 */
@Mapper
public interface DataSourceMapper extends BaseMapper<DataSource> {

    int updateByPrimaryKeySelective(DataSource dataSource);

}
