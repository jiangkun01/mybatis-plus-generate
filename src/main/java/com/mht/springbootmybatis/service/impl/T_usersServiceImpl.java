package com.mht.springbootmybatis.service.impl;

import com.mht.springbootmybatis.entity.T_users;
import com.mht.springbootmybatis.mapper.T_usersMapper;
import com.mht.springbootmybatis.service.IT_usersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2019-02-15
 */
@Service
public class T_usersServiceImpl extends ServiceImpl<T_usersMapper, T_users> implements IT_usersService {

}
