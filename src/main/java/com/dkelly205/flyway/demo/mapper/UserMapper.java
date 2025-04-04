package com.dkelly205.flyway.demo.mapper;

import com.dkelly205.flyway.demo.dto.UserResponse;
import com.dkelly205.flyway.demo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserResponse toUserResponse(User user);

}
