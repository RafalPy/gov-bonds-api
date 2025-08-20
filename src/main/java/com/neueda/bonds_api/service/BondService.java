package com.neueda.bonds_api.service;

import com.neueda.bonds_api.entity.BondEntity;
import com.neueda.bonds_api.entity.IssuerEntity;
import com.neueda.bonds_api.exception.BondNotFoundException;
import com.neueda.bonds_api.exception.InvalidParamsException;
import com.neueda.bonds_api.repository.BondRepository;
import com.neueda.bonds_api.repository.IssuerRepository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BondService {

    private final BondRepository bondRepository;
    private final IssuerRepository issuerRepository;

    public BondService(BondRepository bondRepository, IssuerRepository issuerRepository) {
        this.bondRepository = bondRepository;
        this.issuerRepository = issuerRepository;
    }

    public List<BondEntity> getAllBonds(){
        return bondRepository.findAll();
    }

    public BondEntity getBondById(long id){
        return bondRepository.findById(id)
        .orElseThrow(() -> new BondNotFoundException("Bond with id "+id+" not found"));
    }

    public List<Map<String, Object>> getAverageProfitMarginByCountry() {
        return bondRepository.findAverageProfitMarginByCountry();
    }

    public void deleteBondById(Long id) {
        if (!bondRepository.existsById(id)) {
            throw new BondNotFoundException("Bond with id " + id + " not found");
        }
        bondRepository.deleteById(id);
    }

    public BondEntity createBond(BondEntity bond) {
         IssuerEntity issuer = issuerRepository.findById(bond.getIssuer().getId())
            .orElseThrow(() -> new InvalidParamsException("Issuer with the given ID does not exist."));
        bond.setIssuer(issuer);
        return bondRepository.save(bond);
    }
}
