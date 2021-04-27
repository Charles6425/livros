package com.api.livros.dto;

import com.api.livros.model.LivroModel;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class LivroDto implements Serializable {
    private Integer id;

    @NotEmpty(message = "O campo TÍTULO é requerido")
    @Length(min= 3, max = 150, message = "O campo TÍTULO deve ter entre 3 e 150 caracteres!")
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
