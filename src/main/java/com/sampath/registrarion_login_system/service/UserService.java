package com.sampath.registrarion_login_system.service;

import com.sampath.registrarion_login_system.dto.UserRegistrationDto;
import com.sampath.registrarion_login_system.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
