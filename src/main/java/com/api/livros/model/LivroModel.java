package com.api.livros.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
@Entity(name = "livro")
public class LivroModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "O campo TÍTULO é requerido")
    @Length(min= 3, max = 150, message = "O campo TÍTULO deve ter entre 3 e 150 caracteres!")
    private String titulo;
    @NotEmpty(message = "O campo NOME DO AUTOR é requerido")
    @Length(min= 3, max = 100, message = "O campo NOME DO AUTOR deve ter entre 3 e 100 caracteres!")
    private String nome_autor;

    private String texto;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private CategoriaModel modelCategoria;

    public LivroModel() {
        super();
    }

    public LivroModel(Integer id, String titulo, String nome_autor, String texto, CategoriaModel modelCategoria) {
        this.id = id;
        this.titulo = titulo;
        this.nome_autor = nome_autor;
        this.texto = texto;
        this.modelCategoria = modelCategoria;
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

    public String getNome_autor() {
        return nome_autor;
    }

    public void setNome_autor(String nome_autor) {
        this.nome_autor = nome_autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public CategoriaModel getModelCategoria() {
        return modelCategoria;
    }

    public void setModelCategoria(CategoriaModel modelCategoria) {
        this.modelCategoria = modelCategoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LivroModel that = (LivroModel) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
