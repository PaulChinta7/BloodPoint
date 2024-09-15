package com.bloodmap.controller;

import com.bloodmap.dataTranferObject.UserRequest;
import com.bloodmap.dataTranferObject.UserResponse;
import com.bloodmap.model.User;
import com.bloodmap.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloodMap")
@AllArgsConstructor
public class UserController {

   private UserService userService;
    @GetMapping("/getUserDetails")
    public ResponseEntity<List<UserResponse>> getUserDetails () {
        return userService.getUserDetails();
    }

    @PostMapping("/addUser")
    public ResponseEntity<Void> addUser (@RequestBody UserRequest userRequest) {
        return userService.addUser(userRequest);
    }

    @PostMapping("/deleteUser")
    public ResponseEntity<Void> deleteUser (@RequestParam String id) {
        return userService.deleteUser(id);
    }
}
