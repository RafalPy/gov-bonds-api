package com.neueda.bonds_api.service;

import com.neueda.bonds_api.entity.BondEntity;

import java.util.List;

public class BondService {

    private final BondRepository bondRepository;

    public BondService(BondRepository bondRespository){
        this.bondRepository=bondRespository;
    }

    public List<BondEntity> viewBonds(){
        return bondRepository.findAll();
    }

    public BondEntity viewByBondId(long id){
        return bondRepository.findById(id);
    }

}
