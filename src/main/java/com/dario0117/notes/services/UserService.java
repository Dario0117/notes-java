package com.dario0117.notes.services;

import com.dario0117.notes.entities.User;
import com.dario0117.notes.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public User get(Integer id) {
        return userRepository.findOne(id);
    }
}
