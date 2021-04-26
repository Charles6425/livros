package com.api.livros.controller;

import com.api.livros.model.LivroModel;
import com.api.livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<LivroModel> findById(@PathVariable Integer id){
        LivroModel obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }

}
