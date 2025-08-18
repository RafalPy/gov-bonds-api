package com.neueda.bonds_api.service;

public class IssuerService {

    private final IssuerRepository issuerRepository;

    public IssuerService(IssuerRepository issuerRepository){
        this.issuerRepository=issuerRepository;
    }

    public List<IssuerEntity> viewIssuers(){
        issuerRepository.findAll();
    }
}
