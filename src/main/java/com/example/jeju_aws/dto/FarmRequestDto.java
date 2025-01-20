package com.example.jeju_aws.dto;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class FarmRequestDto {

    @NotNull
    private String name;

    @NotNull
    private String address;

    private String phone;
    private String operatingHours;
    private String description;
    private Double latitude;
    private Double longitude;
    private String keywords;
    private String imageUrl;
    
    // 추가된 필드
    private String homepageLink;  // 홈페이지 링크
    private String productName1;  // 판매 상품 1 이름
    private BigDecimal productPrice1;  // 판매 상품 1 가격
    private String productName2;  // 판매 상품 2 이름
    private BigDecimal productPrice2;  // 판매 상품 2 가격

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(String operatingHours) {
        this.operatingHours = operatingHours;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getHomepageLink() {
        return homepageLink;
    }

    public void setHomepageLink(String homepageLink) {
        this.homepageLink = homepageLink;
    }

    public String getProductName1() {
        return productName1;
    }

    public void setProductName1(String productName1) {
        this.productName1 = productName1;
    }

    public BigDecimal getProductPrice1() {
        return productPrice1;
    }

    public void setProductPrice1(BigDecimal productPrice1) {
        this.productPrice1 = productPrice1;
    }

    public String getProductName2() {
        return productName2;
    }

    public void setProductName2(String productName2) {
        this.productName2 = productName2;
    }

    public BigDecimal getProductPrice2() {
        return productPrice2;
    }

    public void setProductPrice2(BigDecimal productPrice2) {
        this.productPrice2 = productPrice2;
    }
}
