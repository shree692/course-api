package com.company.course_api.service;

import com.company.course_api.model.User;
import com.company.course_api.model.UserResponse;
import com.company.course_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User signup(User user) {
        return userRepository.save(user);
    }

    // THIS METHOD UPDATE KARNA THA
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(user -> new UserResponse(
                        user.getId(),
                        user.getFirstName(),
                        user.getLastName()
                ))
                .toList();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }
}
