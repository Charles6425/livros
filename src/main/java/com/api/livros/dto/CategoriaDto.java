package com.api.livros.dto;

import com.api.livros.model.CategoriaModel;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class CategoriaDto implements Serializable {
    private Integer id;
    @NotEmpty(message = "O campo NOME é requerido!")
    @Length(min = 3, max = 150, message = "O campo NOME deve ter entre 3 e 150 caracteres!")
    private String nome;

    @NotEmpty(message = "O campo DESCRIÇÃO é requerido!")
    @Length(min = 3, max = 250, message = "O campo DESCRIÇÃO deve ter entre 3 e 250 caracteres!")
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
