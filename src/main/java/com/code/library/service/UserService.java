package com.code.library.service;

import com.code.library.domain.User;
import com.code.library.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User addUser(User request){
        return userRepository.save(request);
    }

    public List<User> getAll(){
        return userRepository.findAll();
    }

}
