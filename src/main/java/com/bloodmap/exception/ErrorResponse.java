package com.bloodmap.exception;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ErrorResponse {
    private String message;
    private int status;
}
