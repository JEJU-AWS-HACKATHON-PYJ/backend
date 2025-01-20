package main.java.com.example.jeju_aws.service;

import main.java.com.example.jeju_aws.dto.FarmRequestDto;
import main.java.com.example.jeju_aws.entity.Farm;
import main.java.com.example.jeju_aws.repository.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class FarmService {

    @Autowired
    private FarmRepository farmRepository;

    // 농장 등록
    public Farm createFarm(FarmRequestDto farmRequestDto) {
        Farm farm = new Farm();
        farm.setName(farmRequestDto.getName());
        farm.setAddress(farmRequestDto.getAddress());
        farm.setPhone(farmRequestDto.getPhone());
        farm.setOperatingHours(farmRequestDto.getOperatingHours());
        farm.setDescription(farmRequestDto.getDescription());
        farm.setLatitude(farmRequestDto.getLatitude());
        farm.setLongitude(farmRequestDto.getLongitude());
        farm.setKeywords(farmRequestDto.getKeywords());
        farm.setImageUrl(farmRequestDto.getImageUrl());
        
        // 추가된 필드들
        farm.setHomepageLink(farmRequestDto.getHomepageLink());
        farm.setProductName1(farmRequestDto.getProductName1());
        farm.setProductPrice1(farmRequestDto.getProductPrice1());
        farm.setProductName2(farmRequestDto.getProductName2());
        farm.setProductPrice2(farmRequestDto.getProductPrice2());

        farm.setCreatedAt(LocalDateTime.now());
        farm.setUpdatedAt(LocalDateTime.now());

        return farmRepository.save(farm);
    }

    // 농장 상세 조회
    public Optional<Farm> getFarmById(Long id) {
        return farmRepository.findById(id);
    }
}
