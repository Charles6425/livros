package com.api.livros.dto;

import com.api.livros.model.CategoriaModel;

import java.io.Serializable;

public class CategoriaDto implements Serializable {
    private Integer id;
    private String nome;
    private String descricao;

    public CategoriaDto(){
        super();
    }

    public CategoriaDto(CategoriaModel obj) {
        super();
        this.id = obj.getId();
        this.nome = obj.getNome();
        this.descricao = obj.getDescricao();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
