package com.yk.stand.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yk.stand.api.CommonResult;
import com.yk.stand.entity.UserEntity;
import com.yk.stand.service.UserService;
import com.yk.stand.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController {

    private final UserService userService;

    @ApiOperation("用户登录")
    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody UserEntity user) {

        JSONObject jsonObject = userService.getUserByName(user.getUsername());
        String boys = JSON.toJSONString(jsonObject);
        String userString = JSON.toJSONString(user);

        if (userString.equals(boys))
            return CommonResult.success(user.getUsername());
        else
            return CommonResult.validateFailed();
    }
}
