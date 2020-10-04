package com.yk.stand.service;

import com.alibaba.fastjson.JSONObject;
import com.yk.stand.entity.UserEntity;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author GnoyNa
 * @since 2020-10-02
 */
public interface UserService {

    JSONObject getUserByName(String username);

}
