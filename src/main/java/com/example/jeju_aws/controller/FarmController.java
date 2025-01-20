package com.example.jeju_aws.controller;

import com.example.jeju_aws.dto.FarmRequestDto;
import com.example.jeju_aws.entity.Farm;
import com.example.jeju_aws.service.FarmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/farms")
public class FarmController {

    @Autowired
    private FarmService farmService;

    // 농장 등록
    @PostMapping
    public ResponseEntity<Farm> createFarm(@RequestBody @Valid FarmRequestDto farmRequestDto) {
        Farm createdFarm = farmService.createFarm(farmRequestDto);
        return new ResponseEntity<>(createdFarm, HttpStatus.CREATED);
    }

    // 농장 상세 조회
    @GetMapping("/{farmId}")
    public ResponseEntity<Farm> getFarmById(@PathVariable Long farmId) {
        Optional<Farm> farm = farmService.getFarmById(farmId);
        if (farm.isPresent()) {
            return new ResponseEntity<>(farm.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
