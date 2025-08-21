package com.neueda.bonds_api.dto;


import java.time.LocalDate;

public class BondRequest {
    private LocalDate expiryDate;
    private int faceValue;
    private int costPrice;
    private String ticker;
    private String description;
    private LocalDate issueDate;
    private Long issuerId;  // <-- important: you just send issuerId

    // getters & setters
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getFaceValue() {
        return faceValue;
    }
    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public int getCostPrice() {
        return costPrice;
    }
    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public String getTicker() {
        return ticker;
    }
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public Long getIssuerId() {
        return issuerId;
    }
    public void setIssuerId(Long issuerId) {
        this.issuerId = issuerId;
    }
}
