
package com.neueda.bonds_api.entity;

import java.lang.annotation.Inherited;

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
    private DateTime expiryDate;
    private int faceValue;
    private int costPrice;
    private String ticker;
    private String Description;
    private DateTime issueDate;

    //Constructor

    public BondEntity() {
    }

    public BondEntity(Long id, DateTime expiryDate)

}
