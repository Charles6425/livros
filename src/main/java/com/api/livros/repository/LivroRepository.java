package com.api.livros.repository;

import com.api.livros.model.LivroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<LivroModel, Integer> {

    @Query("SELECT obj FROM livro obj where obj.modelCategoria.id = :id_cat")
    List<LivroModel> findAllByCategoria(@Param(value = "id_cat")  Integer id_cat);
}
