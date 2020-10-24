package com.code.library.api;

import com.code.library.domain.User;
import com.code.library.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/user")
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public List<User> getUsers() {
        return userService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/addUser")
    public User addUser(@RequestBody User request){
        return userService.addUser(request);
    }
}
