
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
