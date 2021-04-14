package com.api.livros;

import com.api.livros.model.ModelCategoria;
import com.api.livros.model.ModelLivro;
import com.api.livros.repository.CategoriaRepository;
import com.api.livros.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;

@SpringBootApplication
public class LivrosApplication implements CommandLineRunner {
    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public static void main(String[] args) {
        SpringApplication.run(LivrosApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ModelCategoria ca1 = new ModelCategoria(null,"Informatica","Livros de informática");
        ModelLivro l1 = new ModelLivro(null, "Titulo do livro","Autor", "texto do livro",ca1);
        ca1.getLivros().addAll(Arrays.asList(l1));

        categoriaRepository.saveAll(Arrays.asList(ca1));
        livroRepository.saveAll(Arrays.asList(l1));
    }
}
