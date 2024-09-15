package com.bloodmap.dataTranferObject;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserResponse {
        private String id;
        private String username;
        private String bloodtype;
        private Integer age;
}
