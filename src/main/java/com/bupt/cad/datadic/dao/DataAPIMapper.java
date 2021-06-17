package com.bupt.cad.datadic.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bupt.cad.datadic.model.po.DataAPI;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/16/19:02
 * @Description:
 */

@Mapper
public interface DataAPIMapper extends BaseMapper<DataAPI> {

    List<DataAPI> selectAll();

    List<DataAPI> selectBySecondCategoryId(Integer id);

}
