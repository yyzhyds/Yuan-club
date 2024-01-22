package com.zhy.auth.application.convert;

import com.zhy.auth.application.dto.AuthUserDTO;
import com.zhy.auth.domain.entity.AuthUserBO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author Lenovo
 * @version 1.0
 * @description TODO
 * @date 21/1/2024 上午10:59
 */
@Mapper
public interface AuthUserDTOConverter {
    AuthUserDTOConverter INSTANCE = Mappers.getMapper(AuthUserDTOConverter.class);

    AuthUserBO convertDTOToBO(AuthUserDTO authUserDTO);

    AuthUserDTO convertBOToDTO(AuthUserBO authUserBO);

}
