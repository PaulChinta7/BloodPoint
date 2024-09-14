package com.bloodmap.controller;

import com.bloodmap.model.User;
import com.bloodmap.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloodMap")
@AllArgsConstructor
public class UserController {

   private UserService userService;

    @GetMapping("/acceptBloodRequest")
    public String acceptBloodRequest (){
        return userService.acceptBloodRequest();
    }

    @GetMapping("/getUserDetails")
    public List<User> getUserDetails () {
        return userService.getUserDetails();
    }

    @PostMapping("/addUser")
    public String addUser (@RequestBody User user) {
        return userService.addUser(user);
    }

    @PostMapping("/delete")
    public String delete (@RequestParam String id) {
        return userService.delete(id);
    }

}
