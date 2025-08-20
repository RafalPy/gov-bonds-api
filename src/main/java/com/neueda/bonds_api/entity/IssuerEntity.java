package com.neueda.bonds_api.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
public class IssuerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;
    private String currency;
    private String continent;
    private String rating;

    @OneToMany(mappedBy = "issuer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BondEntity> bonds = new ArrayList<>();

    public List<BondEntity> getBonds() {
        return bonds;
    }

    public void setBonds(List<BondEntity> bonds) {
        this.bonds = bonds;
    }

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

 
    public IssuerEntity(){
    }
    public IssuerEntity(String country, String currency, String continent, String rating){
        this.country = country;
        this.currency = currency;
        this.continent = continent;
        this.rating = rating;
    }


    public Long getId() {
        return id;
    }

    



}
