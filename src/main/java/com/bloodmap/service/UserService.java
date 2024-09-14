package com.bloodmap.service;

import com.bloodmap.model.User;
import com.bloodmap.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

   private UserRepository userRepository;
    public String acceptBloodRequest() {
    return "success";
    }


    public ResponseEntity<List<User>> getUserDetails() {
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    public String addUser(User user) {

        userRepository.save(user);
        return "success";
    }

    public String delete( String id ) {

        userRepository.deleteById(id);
        return "deleted";
    }
}
