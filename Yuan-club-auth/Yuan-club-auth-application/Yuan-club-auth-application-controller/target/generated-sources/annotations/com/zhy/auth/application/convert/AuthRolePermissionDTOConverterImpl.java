package com.zhy.auth.application.convert;

import com.zhy.auth.application.dto.AuthRolePermissionDTO;
import com.zhy.auth.domain.entity.AuthRolePermissionBO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-01-22T11:13:02+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class AuthRolePermissionDTOConverterImpl implements AuthRolePermissionDTOConverter {

    @Override
    public AuthRolePermissionBO convertDTOToBO(AuthRolePermissionDTO authRolePermissionDTO) {
        if ( authRolePermissionDTO == null ) {
            return null;
        }

        AuthRolePermissionBO authRolePermissionBO = new AuthRolePermissionBO();

        authRolePermissionBO.setId( authRolePermissionDTO.getId() );
        authRolePermissionBO.setRoleId( authRolePermissionDTO.getRoleId() );
        authRolePermissionBO.setPermissionId( authRolePermissionDTO.getPermissionId() );
        List<Long> list = authRolePermissionDTO.getPermissionIdList();
        if ( list != null ) {
            authRolePermissionBO.setPermissionIdList( new ArrayList<Long>( list ) );
        }

        return authRolePermissionBO;
    }
}
