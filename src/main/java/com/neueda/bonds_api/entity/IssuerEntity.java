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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

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
