
package com.neueda.bonds_api.entity;

import java.lang.annotation.Inherited;
import java.time.LocalDate;
import java.util.Date;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class BondEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate expiryDate;
    private int faceValue;
    private int costPrice;
    private String ticker;

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

    public BondEntity(long id,LocalDate expiryDate, int faceValue,int costPrice,String ticker, String Description,LocalDate issueDate){
        this.id = id;
        this.expiryDate=expiryDate;
        this.faceValue = faceValue;
        this.costPrice=costPrice;
        this.ticker = ticker;
        this.Description=Description;
        this.issueDate = issueDate;
    }

//    public BondEntity(Long id, DateTime expiryDate);

}
