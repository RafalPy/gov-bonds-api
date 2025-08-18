package com.neueda.bonds_api.service;
import com.neueda.bonds_api.entity.IssuerEntity;
import com.neueda.bonds_api.exception.IssuerNotFoundException;
import com.neueda.bonds_api.repository.IssuerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssuerService {

    private final IssuerRepository issuerRepository;

    public IssuerService(IssuerRepository issuerRepository){
        this.issuerRepository=issuerRepository;
    }

    public List<IssuerEntity> getIssuers(){
        return issuerRepository.findAll();
    }

    public IssuerEntity getIssuersById(long id){
        return issuerRepository.findById(id)
                .orElseThrow(() -> new IssuerNotFoundException("Issuer with id " + id + " not found"));
    }
}
