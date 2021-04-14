package com.api.livros.model;


public class ModelLivro {
    private Integer id;
    private String titulo;
    private String nome_autor;
    private String texto;
    private ModelCategoria modelCategoria;

    public ModelLivro() {
        super();
    }

    public ModelLivro(Integer id, String titulo, String nome_autor, String texto, ModelCategoria modelCategoria) {
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

    public ModelCategoria getModelCategoria() {
        return modelCategoria;
    }

    public void setModelCategoria(ModelCategoria modelCategoria) {
        this.modelCategoria = modelCategoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModelLivro that = (ModelLivro) o;

        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
