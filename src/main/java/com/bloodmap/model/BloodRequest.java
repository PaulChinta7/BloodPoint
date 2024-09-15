package com.bloodmap.model;

import com.bloodmap.dataTranferObject.Address;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "BloodReqeust")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BloodRequest {
   private String id;
   private String requesterid;
   private String accepterid;
   private LocalDateTime date;
   private Integer ageBy;
   private String requestedBloodType;
   private String message;
}
