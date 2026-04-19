/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Italo
 */
import java.util.List;
import java.util.ArrayList;

public class PerfilUsuario {
    // Atributos do perfil
    private String descricao;
    private List<String> permissoes;

    // Construtor vazio
    public PerfilUsuario() {
        this.permissoes = new ArrayList<>();
    }

    // Construtor com parâmetros
    public PerfilUsuario(String descricao, List<String> permissoes) {
        this.descricao = descricao;
        this.permissoes = permissoes;
    }

    // Getter e Setter de descricao
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Getter e Setter de permissoes
    public List<String> getPermissoes() {
        return permissoes;
    }
    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }

    // Método utilitário para adicionar uma permissão à lista
    public void adicionarPermissao(String permissao) {
        this.permissoes.add(permissao);
    }

    // Representação textual do objeto
    @Override
    public String toString() {
        return "PerfilUsuario{" +
               "descricao='" + descricao + "'" +
               ", permissoes=" + permissoes +
               "}";
    }
}
