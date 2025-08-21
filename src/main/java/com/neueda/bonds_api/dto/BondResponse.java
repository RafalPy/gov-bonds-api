package com.neueda.bonds_api.dto;

import java.time.LocalDate;

public class BondResponse {

    private Long id;
    private LocalDate expiryDate;
    private int faceValue;
    private int costPrice;
    private String ticker;
    private LocalDate issueDate;
    private String description;
    private Long issuerId;      // only the issuer's ID
    private String issuerName;  // optional, name of the issuer

    // Constructors
    public BondResponse() {}

    public BondResponse(Long id, LocalDate expiryDate, int faceValue, int costPrice, String ticker,
                        LocalDate issueDate, String description, Long issuerId, String issuerName) {
        this.id = id;
        this.expiryDate = expiryDate;
        this.faceValue = faceValue;
        this.costPrice = costPrice;
        this.ticker = ticker;
        this.issueDate = issueDate;
        this.description = description;
        this.issuerId = issuerId;
        this.issuerName = issuerName;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDate getExpiryDate() { return expiryDate; }
    public void setExpiryDate(LocalDate expiryDate) { this.expiryDate = expiryDate; }

    public int getFaceValue() { return faceValue; }
    public void setFaceValue(int faceValue) { this.faceValue = faceValue; }

    public int getCostPrice() { return costPrice; }
    public void setCostPrice(int costPrice) { this.costPrice = costPrice; }

    public String getTicker() { return ticker; }
    public void setTicker(String ticker) { this.ticker = ticker; }

    public LocalDate getIssueDate() { return issueDate; }
    public void setIssueDate(LocalDate issueDate) { this.issueDate = issueDate; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Long getIssuerId() { return issuerId; }
    public void setIssuerId(Long issuerId) { this.issuerId = issuerId; }

    public String getIssuerName() { return issuerName; }
    public void setIssuerName(String issuerName) { this.issuerName = issuerName; }}
