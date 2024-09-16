package com.bloodmap.controller;

import com.bloodmap.dataTranferObject.BloodAcceptRequest;
import com.bloodmap.dataTranferObject.BloodAddRequestDTO;
import com.bloodmap.dataTranferObject.BloodRequestData;
import com.bloodmap.service.BloodRequestService;
import com.bloodmap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    
    
    @PostMapping("/addBloodRequest")
    public ResponseEntity<Void> addBloodRequest(@RequestBody BloodAddRequestDTO bloodAddRequestDTO){
        return bloodRequestService.addBloodRequest(bloodAddRequestDTO);
    }
    
    @PostMapping("/acceptBloodRequest")
    public ResponseEntity<Void> acceptBloodRequest(@RequestBody BloodAcceptRequest bloodAcceptRequest)
    {
        return bloodRequestService.acceptBloodRequest(bloodAcceptRequest);
    }
    
}
