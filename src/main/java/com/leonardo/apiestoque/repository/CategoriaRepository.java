package com.leonardo.apiestoque.repository;

import com.leonardo.apiestoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Produto, Integer> {
}
