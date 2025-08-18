package com.neueda.bonds_api.controller;

import com.fasterxml.jackson.core.util.RecyclerPool;
import com.neueda.bonds_api.entity.IssuerEntity;
import com.neueda.bonds_api.service.IssuerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/issuers")
public class IssuerController {

    private final IssuerService issuerService;

    public IssuerController(IssuerService issuerService) {
        this.issuerService = issuerService;
    }

    @GetMapping
    public ResponseEntity<List<IssuerEntity>> getIssuers() {
        List<IssuerEntity> issuers = issuerService.getIssuers();

        return ResponseEntity.ok(issuers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<IssuerEntity> getIssuersById(@PathVariable Long id) {
        IssuerEntity issuer = issuerService.getIssuersById(id);
        return ResponseEntity.ok(issuer);
    }

}
