
package com.neueda.bonds_api.entity;

import java.time.LocalDate;

import jakarta.persistence.*;


@Entity
public class BondEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate expiryDate;
    private int faceValue;
    private int costPrice;
    private String ticker;

    @ManyToOne
    @JoinColumn(name = "issuer_id",nullable=false)
    private IssuerEntity issuer;

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
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    private String Description;
    private LocalDate issueDate;

    //Constructor

    public BondEntity() {}

    public BondEntity(LocalDate expiryDate, int faceValue,IssuerEntity issuer,int costPrice,String ticker, String Description,LocalDate issueDate){
        this.expiryDate=expiryDate;
        this.faceValue = faceValue;
        this.costPrice=costPrice;
        this.ticker = ticker;
        this.Description=Description;
        this.issueDate = issueDate;
        this.issuer=issuer;
    }








}
