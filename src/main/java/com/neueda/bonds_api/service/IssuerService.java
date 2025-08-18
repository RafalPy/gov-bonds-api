package com.neueda.bonds_api.service;

import com.neueda.bonds_api.entity.BondEntity;

public class IssuerService {

    private final IssuerRepository issuerRepository;

    public IssuerService(IssuerRepository issuerRepository){
        this.issuerRepository=issuerRepository;
    }

    public List<IssuerEntity> viewIssuers(){
        issuerRepository.findAll();
    }

    public IssuerEntity viewByIssuerId(long id){
        return issuerRepository.findById(id);
    }
}
