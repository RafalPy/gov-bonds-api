package com.neueda.bonds_api.service;

import com.neueda.bonds_api.entity.BondEntity;
import com.neueda.bonds_api.exception.BondNotFoundException;
import com.neueda.bonds_api.repository.BondRepository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class BondService {

    private final BondRepository bondRepository;

    public BondService(BondRepository bondRespository){
        this.bondRepository=bondRespository;
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
}
