package com.refugiados.web_refugiados;

public class Postagem {

    // declaração de variaveis
    private int id_postagem;
    private String titulo_postagem;
    private String resumo_postagem;
    private String conteudo_postagem;
    private boolean status_publicacao;

    // método construtor vazio
    public Postagem() {
    }

    // método construtor com todas as variaveis
    public Postagem(int id_postagem, String titulo_postagem, String resumo_postagem, String conteudo_postagem,
            boolean status_publicacao) {
        this.id_postagem = id_postagem;
        this.titulo_postagem = titulo_postagem;
        this.resumo_postagem = resumo_postagem;
        this.conteudo_postagem = conteudo_postagem;
        this.status_publicacao = status_publicacao;
    }
    // métodos getters
    public int getId_postagem() {
        return id_postagem;
    }

    public String getTitulo_postagem() {
        return titulo_postagem;
    }

    public String getResumo_postagem() {
        return resumo_postagem;
    }

    public String getConteudo_postagem() {
        return conteudo_postagem;
    }

    public boolean isStatus_publicacao() {
        return status_publicacao;
    }
    // métodos setters
    public void setId_postagem(int id_postagem) {
        this.id_postagem = id_postagem;
    }

    public void setTitulo_postagem(String titulo_postagem) {
        this.titulo_postagem = titulo_postagem;
    }

    public void setResumo_postagem(String resumo_postagem) {
        this.resumo_postagem = resumo_postagem;
    }

    public void setConteudo_postagem(String conteudo_postagem) {
        this.conteudo_postagem = conteudo_postagem;
    }

    public void setStatus_publicacao(boolean status_publicacao) {
        this.status_publicacao = status_publicacao;
    }

}
