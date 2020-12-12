package com.refugiados.web_refugiados;

public class Categoria {

    // declaração de variaveis
    private int id_categoria;
    private String nome_categoria;
    private String descricao_categoria;

    // método construtor vazio
    public Categoria() {
    }

    // método construtor com todas as variaveis
    public Categoria(int id_categoria, String nome_categoria, String descricao_categoria) {
        this.id_categoria = id_categoria;
        this.nome_categoria = nome_categoria;
        this.descricao_categoria = descricao_categoria;
    }

    // métodos getters
    public int getId_categoria() {
        return id_categoria;
    }

    public String getNome_categoria() {
        return nome_categoria;
    }

    public String getDescricao_categoria() {
        return descricao_categoria;
    }

    // métodos setters
    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public void setNome_categoria(String nome_categoria) {
        this.nome_categoria = nome_categoria;
    }

    public void setDescricao_categoria(String descricao_categoria) {
        this.descricao_categoria = descricao_categoria;
    }

}
