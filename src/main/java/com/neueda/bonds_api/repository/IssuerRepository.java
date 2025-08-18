package com.neueda.bonds_api.repository;
import com.neueda.bonds_api.entity.IssuerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssuerRepository extends JpaRepository<IssuerEntity,Long> {
}
