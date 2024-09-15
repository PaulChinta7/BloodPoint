package com.bloodmap.dataTranferObject;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BloodRequestDto {
    private String username;
    private String bloodtype;
    private String age;
}
