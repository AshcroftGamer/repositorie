package com.rains.repositorie.repository;

import com.rains.repositorie.model.MarcaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<MarcaModel, Integer> {
}
