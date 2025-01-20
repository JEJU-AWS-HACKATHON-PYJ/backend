package com.example.jeju_aws.service;

import com.example.jeju_aws.dto.FarmRequestDto;
import com.example.jeju_aws.entity.Farm;
import com.example.jeju_aws.repository.FarmRepository;
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

    // 즐겨찾기 상태 업데이트
    public boolean updateFavoriteStatus(Long farmId, boolean isFavorite) {
        Optional<Farm> optionalFarm = farmRepository.findById(farmId);
        if (optionalFarm.isPresent()) {
            Farm farm = optionalFarm.get();
            farm.setFavorite(isFavorite);
            farmRepository.save(farm);
            return true;
        }
        return false;
    }

}
