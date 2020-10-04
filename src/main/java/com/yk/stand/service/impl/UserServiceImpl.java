package com.yk.stand.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.yk.stand.entity.UserEntity;
import com.yk.stand.mapper.UserMapper;
import com.yk.stand.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author GnoyNa
 * @since 2020-10-02
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserServiceImpl implements UserService {

    @Resource
    private final UserMapper userMapper;

    @Override
    public JSONObject getUserByName(String username) {
        JSONObject jsonObject = userMapper.getUserByName(username);
        return jsonObject;
    }
}
