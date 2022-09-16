package com.example.userservice.service;

import com.example.userservice.dto.UserDto;
import com.example.userservice.jpa.UserEntity;
import org.springframework.security.core.userdetails.UserDetailsService;

//얘는 WebSecurity에서 configure사용 시 userService를 사용하기 위해서 UserDetailsService가 인자로 필요하기 때문에 extends 받은 것
public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUsersById(String userId);
    Iterable<UserEntity> getUsersByAll();
}
