package com.example.tracking_backend.service;

import com.example.tracking_backend.dto.BaggageDto;

import java.util.List;

public interface BaggageService {
    BaggageDto createBaggage(BaggageDto baggageDto);

    BaggageDto getBaggageById(Long baggageId);

    List<BaggageDto> getAllBaggages();

    BaggageDto updateBaggage(Long baggageId, BaggageDto updatedBaggage);

    void deleteBaggage(Long baggageId);
}
