package com.yk.stand.admin.service;

import com.alibaba.fastjson.JSONObject;

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
