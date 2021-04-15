package com.api.livros.service;

import com.api.livros.model.ModelCategoria;
import com.api.livros.model.ModelLivro;
import com.api.livros.repository.CategoriaRepository;
import com.api.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBancoDeDados() {
        ModelCategoria ca1 = new ModelCategoria(null, "Informatica", "Livros de informática");
        ModelLivro l1 = new ModelLivro(null, "Titulo do livro", "Autor", "texto do livro", ca1);
        ca1.getLivros().addAll(Arrays.asList(l1));
        
        categoriaRepository.saveAll(Arrays.asList(ca1));
        livroRepository.saveAll(Arrays.asList(l1));
    }
}
