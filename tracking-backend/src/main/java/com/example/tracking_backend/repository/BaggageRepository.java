package com.example.tracking_backend.repository;

import com.example.tracking_backend.entity.Baggage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BaggageRepository extends JpaRepository<Baggage, Long> {

}
