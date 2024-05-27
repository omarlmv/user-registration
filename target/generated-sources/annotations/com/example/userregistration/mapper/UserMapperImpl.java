package com.example.userregistration.mapper;

import com.example.userregistration.dto.PhoneDTO;
import com.example.userregistration.dto.UserDTO;
import com.example.userregistration.model.Phone;
import com.example.userregistration.model.PhoneEntity;
import com.example.userregistration.model.UserEntity;
import com.example.userregistration.model.UserRequest;
import com.example.userregistration.model.UserResponse;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-27T04:09:05-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.23 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity toEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setCreated( offsetDateTimeToDate( userDTO.getCreated() ) );
        userEntity.setModified( offsetDateTimeToDate( userDTO.getModified() ) );
        userEntity.setLastLogin( offsetDateTimeToDate( userDTO.getLastLogin() ) );
        userEntity.setToken( uuidToString( userDTO.getToken() ) );
        userEntity.setId( userDTO.getId() );
        userEntity.setName( userDTO.getName() );
        userEntity.setEmail( userDTO.getEmail() );
        userEntity.setIsActive( userDTO.getIsActive() );
        userEntity.setPhones( phoneDTOListToPhoneEntityList( userDTO.getPhones() ) );

        return userEntity;
    }

    @Override
    public UserDTO toDTO(UserRequest userRequest) {
        if ( userRequest == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setName( userRequest.getName() );
        userDTO.setEmail( userRequest.getEmail() );
        userDTO.setPhones( phoneListToPhoneDTOList( userRequest.getPhones() ) );

        userDTO.setCreated( OffsetDateTime.now(ZoneOffset.UTC) );
        userDTO.setModified( OffsetDateTime.now(ZoneOffset.UTC) );
        userDTO.setLastLogin( OffsetDateTime.now(ZoneOffset.UTC) );
        userDTO.setToken( UUID.randomUUID() );
        userDTO.setIsActive( true );

        return userDTO;
    }

    @Override
    public PhoneEntity toEntity(PhoneDTO phoneDTO) {
        if ( phoneDTO == null ) {
            return null;
        }

        PhoneEntity phoneEntity = new PhoneEntity();

        phoneEntity.setId( phoneDTO.getId() );
        phoneEntity.setNumber( phoneDTO.getNumber() );
        phoneEntity.setCityCode( phoneDTO.getCityCode() );
        phoneEntity.setContryCode( phoneDTO.getContryCode() );

        return phoneEntity;
    }

    @Override
    public UserResponse toResponse(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        userResponse.setCreated( dateToOffsetDateTime( userEntity.getCreated() ) );
        userResponse.setModified( dateToOffsetDateTime( userEntity.getModified() ) );
        userResponse.setLastLogin( dateToOffsetDateTime( userEntity.getLastLogin() ) );
        userResponse.setToken( stringToUUID( userEntity.getToken() ) );
        userResponse.setId( userEntity.getId() );
        userResponse.setIsActive( userEntity.getIsActive() );

        return userResponse;
    }

    protected List<PhoneEntity> phoneDTOListToPhoneEntityList(List<PhoneDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<PhoneEntity> list1 = new ArrayList<PhoneEntity>( list.size() );
        for ( PhoneDTO phoneDTO : list ) {
            list1.add( toEntity( phoneDTO ) );
        }

        return list1;
    }

    protected PhoneDTO phoneToPhoneDTO(Phone phone) {
        if ( phone == null ) {
            return null;
        }

        PhoneDTO phoneDTO = new PhoneDTO();

        phoneDTO.setNumber( phone.getNumber() );

        return phoneDTO;
    }

    protected List<PhoneDTO> phoneListToPhoneDTOList(List<Phone> list) {
        if ( list == null ) {
            return null;
        }

        List<PhoneDTO> list1 = new ArrayList<PhoneDTO>( list.size() );
        for ( Phone phone : list ) {
            list1.add( phoneToPhoneDTO( phone ) );
        }

        return list1;
    }
}
