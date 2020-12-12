package com.refugiados.web_refugiados;

public class Idioma {

    // declaração de variaveis
    private int id_idioma;
    private String nome_idioma;
    private String abreviatura_idioma;

    // método construtor vazio
    public Idioma() {
    }

    // método construtor com todas as variaveis
    public Idioma(int id_idioma, String nome_idioma, String abreviatura_idioma) {
        this.id_idioma = id_idioma;
        this.nome_idioma = nome_idioma;
        this.abreviatura_idioma = abreviatura_idioma;
    }

    // métodos getters
    public int getId_idioma() {
        return id_idioma;
    }

    public String getNome_idioma() {
        return nome_idioma;
    }

    public String getAbreviatura_idioma() {
        return abreviatura_idioma;
    }

    // métodos setters
    public void setId_idioma(int id_idioma) {
        this.id_idioma = id_idioma;
    }

    public void setNome_idioma(String nome_idioma) {
        this.nome_idioma = nome_idioma;
    }

    public void setAbreviatura_idioma(String abreviatura_idioma) {
        this.abreviatura_idioma = abreviatura_idioma;
    }

}
