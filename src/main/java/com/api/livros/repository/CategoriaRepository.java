package com.api.livros.repository;

import com.api.livros.model.ModelCategoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<ModelCategoria, Integer> {
}
