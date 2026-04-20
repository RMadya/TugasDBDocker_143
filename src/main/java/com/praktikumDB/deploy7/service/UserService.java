package com.praktikumDB.deploy7.service;

import com.praktikumDB.deploy7.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
}
