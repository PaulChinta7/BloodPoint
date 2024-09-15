package com.bloodmap.service;

import com.bloodmap.dataTranferObject.BloodRequestData;
import com.bloodmap.dataTranferObject.UserResponse;
import com.bloodmap.mapper.UserDataMapper;
import com.bloodmap.model.BloodRequest;
import com.bloodmap.model.User;
import com.bloodmap.repository.BloodRequestRepository;
import com.bloodmap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BloodRequestService {

    @Autowired
    private BloodRequestRepository bloodRequestRepository;

    @Autowired
    private  UserRepository userRepository;

    @Autowired
    private UserDataMapper userDataMapper;

    public ResponseEntity<List<BloodRequestData>> getBloodRequest() {
        List<BloodRequestData> newBloodRequestDetails = new ArrayList<>();
        List<BloodRequest> bloodRequestDetails = bloodRequestRepository.findAll();
        for(BloodRequest obj : bloodRequestDetails){
        Optional<User> requestBloodUesr = userRepository.findById(obj.getRequesterid());
        User user = requestBloodUesr.get();
        BloodRequestData bloodRequestData=BloodRequestData.builder()
                .ageBy(obj.getAgeBy())
                .date(obj.getDate())
                .name(user.getUsername())
                .phone(user.getPhone())
                .email(user.getEmail())
                .requestedBloodType(obj.getRequestedBloodType())
                .requesterid(obj.getRequesterid())
                .date(obj.getDate())
                .message(obj.getMessage())
                .longitude(user.getLongitude())
                .lattitude(user.getLattitude())
                .build();

        newBloodRequestDetails.add(bloodRequestData);
        }
        return new ResponseEntity<>(newBloodRequestDetails, HttpStatus.OK);
    }

}
