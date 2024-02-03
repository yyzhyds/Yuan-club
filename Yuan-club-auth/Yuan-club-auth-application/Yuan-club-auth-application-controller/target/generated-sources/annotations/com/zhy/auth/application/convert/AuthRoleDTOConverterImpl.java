package com.zhy.auth.application.convert;

import com.zhy.auth.application.dto.AuthRoleDTO;
import com.zhy.auth.domain.entity.AuthRoleBO;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-01T09:58:27+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class AuthRoleDTOConverterImpl implements AuthRoleDTOConverter {

    @Override
    public AuthRoleBO convertDTOToBO(AuthRoleDTO authRoleDTO) {
        if ( authRoleDTO == null ) {
            return null;
        }

        AuthRoleBO authRoleBO = new AuthRoleBO();

        authRoleBO.setId( authRoleDTO.getId() );
        authRoleBO.setRoleName( authRoleDTO.getRoleName() );
        authRoleBO.setRoleKey( authRoleDTO.getRoleKey() );

        return authRoleBO;
    }
}
