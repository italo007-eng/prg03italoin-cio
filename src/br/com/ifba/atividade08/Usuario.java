/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Italo
 */
public class Usuario {
    // Atributos do usuário
    // O atributo "perfil" cria o RELACIONAMENTO com PerfilUsuario
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private boolean ativo;

    // Construtor vazio
    public Usuario() {
    }

    // Construtor com parâmetros
    public Usuario(PerfilUsuario perfil, String nomeUsuario, String email, String senha, boolean ativo) {
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.ativo = ativo;
    }

    // Getters e Setters
    public PerfilUsuario getPerfil() {
        return perfil;
    }
    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
               "nomeUsuario='" + nomeUsuario + "'" +
               ", email='" + email + "'" +
               ", ativo=" + ativo +
               ", perfil=" + perfil +
               "}";
    }
}
