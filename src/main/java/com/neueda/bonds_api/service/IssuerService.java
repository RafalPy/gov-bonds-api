package com.neueda.bonds_api.service;
import com.neueda.bonds_api.entity.IssuerEntity;
import com.neueda.bonds_api.repository.IssuerRepository;
import java.util.List;
import java.util.Optional;

public class IssuerService {

    private final IssuerRepository issuerRepository;

    public IssuerService(IssuerRepository issuerRepository){
        this.issuerRepository=issuerRepository;
    }

    public List<IssuerEntity> viewIssuers(){
        return issuerRepository.findAll();
    }

    public Optional<IssuerEntity> viewByIssuerId(long id){
        return issuerRepository.findById(id);
    }
}
