package com.bloodmap.controller;

import com.bloodmap.dataTranferObject.BloodRequestData;
import com.bloodmap.service.BloodRequestService;
import com.bloodmap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bloodRequest")
public class BloodController {

    @Autowired
    private UserService userService;
    @Autowired
    private BloodRequestService bloodRequestService;
    @GetMapping("/getBloodRequest")
    public ResponseEntity<List<BloodRequestData>> getBloodRequest (){
        return bloodRequestService.getBloodRequest();
    }
}
