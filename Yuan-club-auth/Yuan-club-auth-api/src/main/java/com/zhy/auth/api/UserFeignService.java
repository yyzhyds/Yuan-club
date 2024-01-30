package com.zhy.auth.api;

import com.zhy.auth.entity.AuthUserDTO;
import com.zhy.auth.entity.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 30/1/2024 上午9:48
 */
@FeignClient("yuan-club-auth-dev")
public interface UserFeignService {

    @RequestMapping("/user/getUserInfo")
    Result<AuthUserDTO> getUserInfo(@RequestBody AuthUserDTO authUserDTO);


}
