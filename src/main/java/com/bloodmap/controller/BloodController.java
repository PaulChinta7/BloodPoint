package com.bloodmap.controller;

import com.bloodmap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class BloodController {
    private UserService userService;
    @PostMapping("/acceptBloodRequest")
    public String acceptBloodRequest (){
        return userService.acceptBloodRequest();
    }
}
