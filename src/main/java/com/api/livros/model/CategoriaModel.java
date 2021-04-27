package com.api.livros.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "categoria")
public class CategoriaModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "O campo NOME é requerido!")
    @Length(min = 3, max = 150, message = "O campo NOME deve ter entre 3 e 150 caracteres!")
    private String nome;

    @NotEmpty(message = "O campo DESCRIÇÃO é requerido!")
    @Length(min = 3, max = 250, message = "O campo DESCRIÇÃO deve ter entre 3 e 250 caracteres!")
    private String descricao;

    @OneToMany(mappedBy = "modelCategoria")
    private List<LivroModel> livros = new ArrayList<>();

    public CategoriaModel(){
        super();
    }

    public CategoriaModel(Integer id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
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

    public List<LivroModel> getLivros() {
        return livros;
    }

    public void setLivros(List<LivroModel> livros) {
        this.livros = livros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategoriaModel that = (CategoriaModel) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
