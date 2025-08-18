package com.neueda.bonds_api.service;

import com.neueda.bonds_api.entity.BondEntity;
import com.neueda.bonds_api.repository.BondRepository;

import java.util.List;
import java.util.Optional;

public class BondService {

    private final BondRepository bondRepository;

    public BondService(BondRepository bondRespository){
        this.bondRepository=bondRespository;
    }

    public List<BondEntity> viewBonds(){
        return bondRepository.findAll();
    }

    public Optional<BondEntity> viewByBondId(long id){
        return bondRepository.findById(id);
    }

}
