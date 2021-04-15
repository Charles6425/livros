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
public class LivrosApplication {


    public static void main(String[] args) {
        SpringApplication.run(LivrosApplication.class, args);
    }


}
