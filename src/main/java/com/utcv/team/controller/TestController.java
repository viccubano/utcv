
package com.utcv.team.controller;

import com.utcv.team.models.User;
import com.utcv.team.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class TestController {


    private final UserService userService;

    public TestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable int id) {
       return userService.findById(id);
    }
    @PostMapping
    public void saveUser(@RequestBody User user) {
        userService.save(user);
    }

}
