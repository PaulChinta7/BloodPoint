package com.bloodmap.dataTranferObject;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserRequest {
        private String username;
        private String password;
        private Address address;
        private String phone;
        private String bloodtype;
        private Integer age;
}


