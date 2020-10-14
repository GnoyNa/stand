package com.yk.stand.admin.mapper;

import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author GnoyNa
 * @since 2020-10-02
 */
@Mapper
public interface UserMapper {


    public JSONObject getUserByName(@Param("username") String username);

}
