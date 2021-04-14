package com.api.livros.repository;

import com.api.livros.model.ModelLivro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<ModelLivro, Integer> {
}
