package com.example.tracking_backend.service.impl;

import com.example.tracking_backend.dto.BaggageDto;
import com.example.tracking_backend.entity.Baggage;
import com.example.tracking_backend.exception.ResourceNotFoundException;
import com.example.tracking_backend.mapper.BaggageMapper;
import com.example.tracking_backend.repository.BaggageRepository;
import com.example.tracking_backend.service.BaggageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class BaggageServiceImpl implements BaggageService {

    private BaggageRepository baggageRepository;

    @Override
    public BaggageDto createBaggage(BaggageDto baggageDto) {

        Baggage baggage= BaggageMapper.mapToBaggage(baggageDto);
        Baggage savedBaggage = baggageRepository.save(baggage);
        return BaggageMapper.mapToBaggageDto(savedBaggage);
    }

    @Override
    public BaggageDto getBaggageById(Long baggageId) {
        Baggage baggage= baggageRepository.findById(baggageId).orElseThrow(() -> new ResourceNotFoundException("Employee with given id does not exist"));

        return BaggageMapper.mapToBaggageDto(baggage);
    }

    @Override
    public List<BaggageDto> getAllBaggages() {
        List<Baggage> baggages=baggageRepository.findAll();

        return baggages.stream().map((baggage)->BaggageMapper.mapToBaggageDto(baggage)).collect(Collectors.toList());
    }

    @Override
    public BaggageDto updateBaggage(Long baggageId, BaggageDto updatedBaggage) {
        Baggage baggage=baggageRepository.findById(baggageId).orElseThrow(
                ()-> new ResourceNotFoundException("Baggage with given id does not exists")
        );
        baggage.setTagNumber(updatedBaggage.getTagNumber());
        baggage.setFlightId(updatedBaggage.getFlightId());
        baggage.setPassengerId(updatedBaggage.getPassengerId());
        baggage.setWeightKg(updatedBaggage.getWeightKg());

        Baggage updatedBaggageObj=baggageRepository.save(baggage);

        return BaggageMapper.mapToBaggageDto(updatedBaggageObj);

    }

    @Override
    public void deleteBaggage(Long baggageId) {
        Baggage baggage=baggageRepository.findById(baggageId).orElseThrow(
                ()-> new ResourceNotFoundException("Baggage with given id does not exists")
        );

        baggageRepository.deleteById(baggageId);
    }
}
