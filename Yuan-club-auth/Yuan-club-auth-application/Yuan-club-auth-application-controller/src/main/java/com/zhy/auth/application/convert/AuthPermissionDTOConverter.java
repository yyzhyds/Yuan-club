package com.zhy.auth.application.convert;

import com.zhy.auth.application.dto.AuthPermissionDTO;
import com.zhy.auth.domain.entity.AuthPermissionBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 22/1/2024 上午10:26
 */
@Mapper
public interface AuthPermissionDTOConverter {
    AuthPermissionDTOConverter INSTANCE = Mappers.getMapper(AuthPermissionDTOConverter.class);

    AuthPermissionBO convertDTOToBO(AuthPermissionDTO authPermissionDTO);

}