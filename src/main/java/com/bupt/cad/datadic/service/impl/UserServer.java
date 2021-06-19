package com.bupt.cad.datadic.service.impl;

import com.bupt.cad.datadic.entity.User;
import com.bupt.cad.datadic.mapper.UserMapper;
import com.bupt.cad.datadic.service.UserServer;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ${author}
 * @since 2021-06-19
 */
@Service
public class UserServer extends ServiceImpl<UserMapper, User> implements UserServer {

}
