package com.zhy.auth.domain.convert;

import com.zhy.auth.domain.entity.AuthUserBO;
import com.zhy.auth.infra.basic.entity.AuthUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 21/1/2024 上午10:59
 */
@Mapper
public interface AuthUserBOConverter {
    AuthUserBOConverter INSTANCE = Mappers.getMapper(AuthUserBOConverter.class);

    AuthUser convertBOToAuthEntity(AuthUserBO authUserBO);
    AuthUserBO convertEntityToBO(AuthUser authUser);

}
