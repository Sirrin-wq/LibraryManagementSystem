package com.syberry.librarymanagementsystem.service;

import com.syberry.librarymanagementsystem.dto.UserRegistrationDto;
import com.syberry.librarymanagementsystem.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
