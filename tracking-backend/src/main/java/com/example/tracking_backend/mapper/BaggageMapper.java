package com.example.tracking_backend.mapper;

import com.example.tracking_backend.dto.BaggageDto;
import com.example.tracking_backend.entity.Baggage;

public class BaggageMapper {

    public static BaggageDto mapToBaggageDto(Baggage baggage){
        return new BaggageDto(
                baggage.getId(),
                baggage.getTagNumber(),
                baggage.getPassengerId(),
                baggage.getFlightId(),
                baggage.getWeightKg()
        );
    }

    public static Baggage mapToBaggage(BaggageDto baggageDto){
        return new Baggage(
                baggageDto.getId(),
                baggageDto.getTagNumber(),
                baggageDto.getPassengerId(),
                baggageDto.getFlightId(),
                baggageDto.getWeightKg()
        );
    }
}
