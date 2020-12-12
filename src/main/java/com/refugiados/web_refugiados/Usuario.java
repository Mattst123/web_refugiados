package com.refugiados.web_refugiados;

public class Usuario {

    // declaração de variaveis
    private int id_usuario;
    private String nome_usuario;
    private String senha_usuario;
    private String email_usuario;
    private int permissao_usuario;

    // método construtor vazio
    public Usuario() {
    }

    // método construtor com todas as variaveis
    public Usuario(int id_usuario, String nome_usuario, String senha_usuario, String email_usuario,
            int permissao_usuario) {
        this.id_usuario = id_usuario;
        this.nome_usuario = nome_usuario;
        this.senha_usuario = senha_usuario;
        this.email_usuario = email_usuario;
        this.permissao_usuario = permissao_usuario;
    }

    // métodos getters
    public int getId_usuario() {
        return id_usuario;
    }

    public String getNome_usuario() {
        return nome_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public int getPermissao_usuario() {
        return permissao_usuario;
    }

    // métodos setters
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public void setPermissao_usuario(int permissao_usuario) {
        this.permissao_usuario = permissao_usuario;
    }

}
