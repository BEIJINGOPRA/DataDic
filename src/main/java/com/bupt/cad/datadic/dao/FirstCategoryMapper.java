package com.bupt.cad.datadic.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bupt.cad.datadic.model.po.DataAPI;
import com.bupt.cad.datadic.model.po.FirstCategory;
import com.bupt.cad.datadic.model.vo.FirstCategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: yuejie
 * @Date: 2021/06/09/11:21
 * @Description:
 */
@Mapper
public interface FirstCategoryMapper extends BaseMapper<FirstCategory> {
    List<FirstCategoryVO> selectAll();
}
