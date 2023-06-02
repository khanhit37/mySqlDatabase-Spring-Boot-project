package com.example.MySqlDatabase.service;

import com.example.MySqlDatabase.config.dto.UserDto;
import com.example.MySqlDatabase.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    User save(UserDto userDto);
}
