package com.yk.stand.mapper;

import com.alibaba.fastjson.JSONObject;
import com.yk.stand.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author GnoyNa
 * @since 2020-10-02
 */
@Mapper
public interface UserMapper{


    public JSONObject getUserByName(@Param("username") String username);

}
