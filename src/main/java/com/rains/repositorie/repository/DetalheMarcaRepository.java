package com.rains.repositorie.repository;

import com.rains.repositorie.model.DetalheMarcaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalheMarcaRepository extends JpaRepository<DetalheMarcaModel, Integer> {
}
