package com.zhy.auth.domain.convert;

import com.zhy.auth.domain.entity.AuthPermissionBO;
import com.zhy.auth.infra.basic.entity.AuthPermission;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-01T09:58:24+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class AuthPermissionBOConverterImpl implements AuthPermissionBOConverter {

    @Override
    public AuthPermission convertBOToEntity(AuthPermissionBO authPermissionBO) {
        if ( authPermissionBO == null ) {
            return null;
        }

        AuthPermission authPermission = new AuthPermission();

        authPermission.setId( authPermissionBO.getId() );
        authPermission.setName( authPermissionBO.getName() );
        authPermission.setParentId( authPermissionBO.getParentId() );
        authPermission.setType( authPermissionBO.getType() );
        authPermission.setMenuUrl( authPermissionBO.getMenuUrl() );
        authPermission.setStatus( authPermissionBO.getStatus() );
        authPermission.setShow( authPermissionBO.getShow() );
        authPermission.setIcon( authPermissionBO.getIcon() );
        authPermission.setPermissionKey( authPermissionBO.getPermissionKey() );

        return authPermission;
    }
}
