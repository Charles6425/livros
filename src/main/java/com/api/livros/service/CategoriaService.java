package com.api.livros.service;


import com.api.livros.exceptions.ObjectNotFoundExceptions;
import com.api.livros.model.CategoriaModel;
import com.api.livros.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    public CategoriaModel findById(Integer id) {
        Optional<CategoriaModel> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions("Objeto não encontrado Id: " + id + ", Tipo: " + CategoriaModel.class.getName()));
    }

    public List<CategoriaModel> findAll(){
        return repository.findAll();
    }

}
