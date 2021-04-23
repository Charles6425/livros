package com.api.livros.service;


import com.api.livros.exceptions.ObjectNotFoundExceptions;
import com.api.livros.model.ModelCategoria;
import com.api.livros.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public ModelCategoria findById(Integer id) {
        Optional<ModelCategoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions("Objeto não encontrado Id: " + id + ", Tipo: " + ModelCategoria.class.getName()));
    }

}
