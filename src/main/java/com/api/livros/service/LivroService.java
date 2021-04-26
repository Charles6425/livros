package com.api.livros.service;

import com.api.livros.model.LivroModel;
import com.api.livros.repository.LivroRepository;
import com.api.livros.service.exceptions.ObjectNotFoundExceptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository repository;

    @Autowired
    private CategoriaService categoriaService;

    public LivroModel findById(Integer id) {
        Optional<LivroModel> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundExceptions("Objeto não encontrado! Id: " + id
                + ", Titulo: " + LivroModel.class.getName()));
    }

    public List<LivroModel> findAll(Integer id_cat) {
        categoriaService.findById(id_cat);
        return repository.findAllByCategoria(id_cat);

    }
}
