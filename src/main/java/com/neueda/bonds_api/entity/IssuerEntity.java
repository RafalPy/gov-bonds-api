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
public class IssuerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String country;
    private String currency;
    private String continent;
    private String rating;
    public IssuerEntity(){
    }
    public IssuerEntity(Long id, String country, String currency, String continent, String rating){
        this.id = id;
        this.country = country;
        this.currency = currency;
        this.continent = continent;
        this.rating = rating;
    }


}
