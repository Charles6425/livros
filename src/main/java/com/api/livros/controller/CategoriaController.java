package com.api.livros.controller;

import com.api.livros.model.ModelCategoria;
import com.api.livros.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService service;

    @GetMapping("/{id}")
    public ResponseEntity<ModelCategoria> findById(@PathVariable Integer id) {
        ModelCategoria obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }
}
