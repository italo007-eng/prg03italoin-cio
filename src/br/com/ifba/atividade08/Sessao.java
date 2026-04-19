/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Italo
 */
public class Sessao {
     // O atributo "usuario" cria o RELACIONAMENTO com Usuario
    private Usuario usuario;
    private String token;

    // Construtor vazio
    public Sessao() {
    }

    // Construtor com parâmetros
    public Sessao(Usuario usuario, String token) {
        this.usuario = usuario;
        this.token = token;
    }

    // Getters e Setters
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Sessao{" +
               "token='" + token + "'" +
               ", usuario=" + usuario.getNomeUsuario() +
               "}";
    }
}
