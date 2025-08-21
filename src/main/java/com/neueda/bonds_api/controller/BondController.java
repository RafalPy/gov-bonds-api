package com.neueda.bonds_api.controller;

import com.neueda.bonds_api.dto.BondRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neueda.bonds_api.entity.BondEntity;
import com.neueda.bonds_api.exception.InvalidParamsException;
import com.neueda.bonds_api.service.BondService;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/bonds")
public class BondController {

    private final BondService bondService;

    public BondController(BondService bondService){
        this.bondService = bondService;
    }

    @GetMapping
    public ResponseEntity<List<BondEntity>> getBonds() {
        List<BondEntity> bonds = bondService.getAllBonds();
        return ResponseEntity.ok(bonds);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BondEntity> getBondById(@PathVariable Long id){
        if (id == null){
            throw new InvalidParamsException("Item id must be provided");
        }
        BondEntity bond = bondService.getBondById(id);
        return ResponseEntity.ok(bond);
    }
    
    @GetMapping("/average-profit-margin")
    public ResponseEntity<List<Map<String, Object>>> getAverageProfitMarginByCountry() {
        List<Map<String, Object>> result = bondService.getAverageProfitMarginByCountry();
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBondById(@PathVariable Long id) {
        if (id == null) {
            throw new InvalidParamsException("Item id must be provided");
        }
        bondService.deleteBondById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<BondEntity> createBond(@RequestBody BondRequest bondRequest) {
        BondEntity createdBond = bondService.addBond(bondRequest);
        return ResponseEntity.ok(createdBond);
    
    }
}
