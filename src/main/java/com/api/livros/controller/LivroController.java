package com.api.livros.controller;

import com.api.livros.dto.LivroDto;
import com.api.livros.model.LivroModel;
import com.api.livros.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
    @GetMapping
    public ResponseEntity<List<LivroDto>> findAll(@RequestParam(value = "categoria", defaultValue = "0")Integer id_cat){
        List<LivroModel> list =service.findAll(id_cat);
        List<LivroDto> listDto = list.stream().map(obj -> new LivroDto(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDto);
    }
    @PutMapping(value="/{id}")
    public ResponseEntity<LivroModel> update(@PathVariable Integer id, @RequestBody LivroModel obj){
        LivroModel newObj = service.update(id,obj);
        return ResponseEntity.ok().body(newObj);
    }

    @PatchMapping(value="/{id}")
    public ResponseEntity<LivroModel> updatePatch(@PathVariable Integer id, @RequestBody LivroModel obj){
        LivroModel newObj = service.update(id,obj);
        return ResponseEntity.ok().body(newObj);
    }

}
