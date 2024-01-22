package com.zhy.auth.domain.convert;

import com.zhy.auth.domain.entity.AuthRoleBO;
import com.zhy.auth.domain.entity.AuthUserBO;
import com.zhy.auth.infra.basic.entity.AuthRole;
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
public interface AuthRoleBOConverter {
    AuthRoleBOConverter INSTANCE = Mappers.getMapper(AuthRoleBOConverter.class);

    AuthRole convertBOToAuthEntity(AuthRoleBO authRoleBO);

    //AuthUserDTO convertBOToDTO(AuthUserBO authUserBO);

}
