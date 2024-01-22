package com.zhy.auth.application.convert;

import com.zhy.auth.application.dto.AuthRolePermissionDTO;
import com.zhy.auth.domain.entity.AuthRolePermissionBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 22/1/2024 上午11:05
 */
@Mapper
public interface AuthRolePermissionDTOConverter {

    AuthRolePermissionDTOConverter INSTANCE = Mappers.getMapper(AuthRolePermissionDTOConverter.class);

    AuthRolePermissionBO convertDTOToBO(AuthRolePermissionDTO authRolePermissionDTO);

}