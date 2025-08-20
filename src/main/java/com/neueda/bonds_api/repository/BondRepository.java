package com.neueda.bonds_api.repository;

import com.neueda.bonds_api.entity.BondEntity;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface BondRepository extends JpaRepository<BondEntity,Long> {

    @Query("SELECT b.issuer.country AS country, AVG((b.faceValue - b.costPrice) * 100.0 / b.costPrice) AS averageProfitMargin " +
           "FROM BondEntity b " +
           "GROUP BY b.issuer.country")
    List<Map<String, Object>> findAverageProfitMarginByCountry();
}
