package org.example.services;

import org.example.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserCRUDService {
    private final UserRepository userRepository;

    public UserCRUDService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
