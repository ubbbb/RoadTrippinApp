package com.example.roadtrippin.mapper;

import com.example.roadtrippin.domain.User;
import com.example.roadtrippin.dto.UserDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser (UserDto dto);

    UserDto toUserDto (User user);

    List<UserDto> toDTO (List<User> userList);

    Iterable<User> toUsers (List<UserDto> userDtoList);

}
