package com.example.tracking_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="baggage")

public class Baggage {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="tag_number")
    private String tagNumber;

    @Column(name="passenger_id")
    private Long passengerId;

    @Column(name="flight_id")
    private Long flightId;

    @Column(name="weight_id")
    private Double weightKg;

}
