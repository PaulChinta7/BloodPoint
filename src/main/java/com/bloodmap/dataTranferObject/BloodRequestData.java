package com.bloodmap.dataTranferObject;

import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class BloodRequestData {
    private String name;
    private int ageBy;
    private String phone;
    private String email;
    private String requestedBloodType;
    private String requesterid;
    private LocalDateTime date;
    private String message;
    private String longitude;
    private String lattitude;
}
