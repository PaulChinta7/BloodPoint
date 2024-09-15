package com.bloodmap.mapper;

import com.bloodmap.dataTranferObject.UserRequest;
import com.bloodmap.dataTranferObject.UserResponse;
import com.bloodmap.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserDataMapper {
    public UserResponse mapToUserResponse(User user){
        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .bloodtype(user.getBloodtype())
                .age(user.getAge())
                .build();
    }
    public User mapToUser(UserRequest userRequest) {
        return User.builder().address(userRequest.getAddress())
                .username(userRequest.getUsername())
                .age(userRequest.getAge())
                .phone(userRequest.getPhone())
                .password(userRequest.getPassword())
                .bloodtype(userRequest.getBloodtype())
                .build();
    }

}
