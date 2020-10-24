package com.code.library.service;

import com.code.library.domain.User;
import com.code.library.dto.LoginRequest;
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

    public User getUser(String email) {
        return userRepository.findByEmail(email);
    }

    public User loginUser(LoginRequest request) throws Exception {
        User user = this.getUser(request.getEmail());
        if (user != null && user.getUser_pass().equals(request.getUserPass())) {
            return user;
        }
        else {
            throw new Exception("Invalid User or Password");
        }
    }

}
