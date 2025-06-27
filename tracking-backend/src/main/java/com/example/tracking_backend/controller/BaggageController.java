package com.example.tracking_backend.controller;

import com.example.tracking_backend.dto.BaggageDto;
import com.example.tracking_backend.service.BaggageService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/baggages")

public class BaggageController {

    private BaggageService baggageService;

    @PostMapping
    public ResponseEntity<BaggageDto> createBaggage(@RequestBody BaggageDto baggageDto){
        BaggageDto savedBaggage=baggageService.createBaggage(baggageDto);
        return new ResponseEntity<>(savedBaggage, HttpStatus.CREATED);
    }


    @GetMapping("{id}")
    public ResponseEntity<BaggageDto> getBaggageById(@PathVariable("id") Long baggageId){
        BaggageDto baggageDto=baggageService.getBaggageById(baggageId);
        return ResponseEntity.ok(baggageDto);
    }

    @GetMapping
    public ResponseEntity<List<BaggageDto>> getAllBaggages(){
        List<BaggageDto> baggages = baggageService.getAllBaggages();
        return ResponseEntity.ok(baggages);
    }

    @PutMapping("{id}")
    public ResponseEntity<BaggageDto> updateBaggage(@PathVariable("id") Long baggageId, @RequestBody BaggageDto updatedBaggage){
        BaggageDto baggageDto= baggageService.updateBaggage(baggageId, updatedBaggage);
        return ResponseEntity.ok(baggageDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteBaggage(@PathVariable("id") Long baggageId){
        baggageService.deleteBaggage(baggageId);

        return ResponseEntity.ok("Baggage deleted successfully");
    }
}


