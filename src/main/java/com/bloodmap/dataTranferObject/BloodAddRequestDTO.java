package com.bloodmap.dataTranferObject;


import lombok.*;

import java.time.LocalDateTime;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BloodAddRequestDTO {
    private String requestorId;
    private LocalDateTime requiredBy;
    private String bloodType;
    private String msg;
    private int donorAgeBy;
    
}
