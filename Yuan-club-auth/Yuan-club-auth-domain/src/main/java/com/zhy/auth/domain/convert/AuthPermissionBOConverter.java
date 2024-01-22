package com.zhy.auth.domain.convert;

import com.zhy.auth.domain.entity.AuthPermissionBO;
import com.zhy.auth.infra.basic.entity.AuthPermission;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 22/1/2024 上午10:29
 */
@Mapper
public interface AuthPermissionBOConverter {

    AuthPermissionBOConverter INSTANCE = Mappers.getMapper(AuthPermissionBOConverter.class);

    AuthPermission convertBOToEntity(AuthPermissionBO authPermissionBO);


}