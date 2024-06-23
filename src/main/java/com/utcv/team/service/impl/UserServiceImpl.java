package com.utcv.team.service.impl;

import com.utcv.team.models.User;
import com.utcv.team.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {

    }

    @Override
    public User findById(int id) {
        User user = new User();
        user.setId(1);
        user.setNombre("Victor");
        user.setApellidos("Vega Bruno");
        user.setEmail("isc.victor.vega@gmail.com");
        user.setTelefono("5518915615");
        return user;
    }
}
