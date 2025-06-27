package com.example.tracking_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class BaggageDto {
    private Long id;
    private String tagNumber;
    private Long passengerId;
    private Long flightId;
    private Double weightKg;
}
