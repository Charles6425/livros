package com.api.livros.dto;

import com.api.livros.model.LivroModel;

import java.io.Serializable;

public class LivroDto implements Serializable {
    private Integer id;
    private String titulo;

    public LivroDto() {
        super();
    }

    public LivroDto(LivroModel obj) {
        super();
        this.id = obj.getId();
        this.titulo = obj.getTitulo();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
