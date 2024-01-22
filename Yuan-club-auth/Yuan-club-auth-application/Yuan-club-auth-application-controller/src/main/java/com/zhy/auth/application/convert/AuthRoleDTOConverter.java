package com.zhy.auth.application.convert;

import com.zhy.auth.application.dto.AuthRoleDTO;
import com.zhy.auth.domain.entity.AuthRoleBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 21/1/2024 下午4:14
 */
@Mapper
public interface AuthRoleDTOConverter {
    AuthRoleDTOConverter INSTANCE = Mappers.getMapper(AuthRoleDTOConverter.class);

    AuthRoleBO  convertDTOToBO(AuthRoleDTO authRoleDTO);

}