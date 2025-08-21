package com.neueda.bonds_api.service;

import com.neueda.bonds_api.dto.BondRequest;
import com.neueda.bonds_api.entity.BondEntity;
import com.neueda.bonds_api.entity.IssuerEntity;
import com.neueda.bonds_api.exception.BondNotFoundException;
import com.neueda.bonds_api.exception.IssuerNotFoundException;
import com.neueda.bonds_api.repository.BondRepository;

import java.util.List;
import java.util.Map;

import com.neueda.bonds_api.repository.IssuerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BondService {


    @Autowired
    private final BondRepository bondRepository;
    private final IssuerRepository issuerRepository;

    public BondService(BondRepository bondRespository, IssuerRepository issuerRepository){
        this.bondRepository=bondRespository;
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

    public BondEntity addBond(BondRequest bondRequest){
        IssuerEntity issuer = issuerRepository.findById(bondRequest.getIssuerId())
                .orElseThrow(()->new IssuerNotFoundException("Issuer not found with id: " + bondRequest.getIssuerId()));

        BondEntity bond = new BondEntity();
        bond.setExpiryDate(bondRequest.getExpiryDate());
        bond.setFaceValue(bondRequest.getFaceValue());
        bond.setCostPrice(bondRequest.getCostPrice());
        bond.setTicker(bondRequest.getTicker());
        bond.setDescription(bondRequest.getDescription());
        bond.setIssueDate(bondRequest.getIssueDate());
        bond.setIssuer(issuer);

        return bondRepository.save(bond);
    }


}
