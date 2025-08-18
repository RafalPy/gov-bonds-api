package com.neueda.bonds_api.repository;

import com.neueda.bonds_api.entity.BondEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BondRepository extends JpaRepository<BondEntity,Long> {
}
