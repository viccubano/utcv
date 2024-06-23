package com.utcv.team.service;

import com.utcv.team.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
     void save(User user);
     User findById(int id);
}
