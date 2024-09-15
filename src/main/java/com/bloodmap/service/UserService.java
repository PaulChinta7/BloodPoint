package com.bloodmap.service;

import com.bloodmap.dataTranferObject.UserRequest;
import com.bloodmap.dataTranferObject.UserResponse;
import com.bloodmap.exception.UserElreadyExistException;
import com.bloodmap.exception.UserNotFoundException;
import com.bloodmap.mapper.UserDataMapper;
import com.bloodmap.model.User;
import com.bloodmap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDataMapper userDataMapper;

    public ResponseEntity<List<UserResponse>> getUserDetails() {
        List<User> fedthed_users = userRepository.findAll();
        List<UserResponse> mapped_Users = new ArrayList<>();
        for (User X : fedthed_users) {
            mapped_Users.add(userDataMapper.mapToUserResponse(X));
        }
        return new ResponseEntity<>(mapped_Users, HttpStatus.OK);
    }

    @Transactional
    public ResponseEntity<Void> addUser(UserRequest userRequest) {
        Optional<User> existingUser = userRepository.findByEmail(userRequest.getPhone());
        if (existingUser.isPresent()) {
            throw new UserElreadyExistException("User already exist");
        }
        User user = userDataMapper.mapToUser(userRequest);
        userRepository.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteUser(String id) {

        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()) {
            throw new UserNotFoundException("User is not found by id to delete");
        }
        userRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
