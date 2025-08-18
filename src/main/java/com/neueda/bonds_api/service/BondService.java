package com.neueda.bonds_api.service;

import com.neueda.bonds_api.entity.BondEntity;

public class BondService {

    private final BondRepository bondRepository;

    public BondService(BoondRepository bondRespository){
        this.bondRepository=bondRespository;
    }

    public List<BondEntity> viewBonds(){
        return bondRepository.findAll();
    }

}
