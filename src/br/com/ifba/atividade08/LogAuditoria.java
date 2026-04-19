/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08;

/**
 *
 * @author Italo
 */
import java.time.LocalDateTime;

public class LogAuditoria {
     // O atributo "usuario" cria o RELACIONAMENTO com Usuario
    private Usuario usuario;
    private String acao;
    private LocalDateTime dataHora;
    private String ip;

    // Construtor vazio
    public LogAuditoria() {
    }

    // Construtor com parâmetros
    // LocalDateTime.now() captura automaticamente a data e hora atual
    public LogAuditoria(Usuario usuario, String acao, String ip) {
        this.usuario = usuario;
        this.acao = acao;
        this.dataHora = LocalDateTime.now(); // preenche automático
        this.ip = ip;
    }

    // Getters e Setters
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getAcao() {
        return acao;
    }
    public void setAcao(String acao) {
        this.acao = acao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "LogAuditoria{" +
               "usuario=" + usuario.getNomeUsuario() +
               ", acao='" + acao + "'" +
               ", dataHora=" + dataHora +
               ", ip='" + ip + "'" +
               "}";
    }
}
