package com.neueda.bonds_api.entity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neueda.bonds_api.entity.BondEntity;
import com.neueda.bonds_api.service.BondService;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


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
    public ResponseEntity<Optional<BondEntity>> getBondById(@PathVariable Long id){
        if (id == null){
            // throw new InvalidParamsException("Item id must be provided");
        }
        Optional<BondEntity> bond = bondService.getBondById(id);
        return ResponseEntity.ok(bond);
    }
    
    
}
