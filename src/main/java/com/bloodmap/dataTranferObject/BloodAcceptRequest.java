package com.bloodmap.dataTranferObject;


import lombok.*;

@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
public class BloodAcceptRequest {
    private String acceptorId;
    private String bloodRequestId;
}
