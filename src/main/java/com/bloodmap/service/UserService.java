package com.bloodmap.service;

import com.bloodmap.model.User;
import com.bloodmap.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

   private UserRepository userRepository;
    public String acceptBloodRequest() {
    return "success";
    }


    public List<User> getUserDetails() {
        return userRepository.findAll();
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
