/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author Italo
 */
/**
 * Classe abstrata que representa uma forma geométrica genérica.
 * Todas as formas herdam dessa classe.
 * É abstrata pois não faz sentido criar uma "Forma" genérica.
 */
public abstract class Forma {
    // Nome da forma (ex: "Círculo", "Cubo")
    private String nome;

    //Construtor que define o nome da forma.
    public Forma(String nome) {
        this.nome = nome;
    }
    //get set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public abstract String toString();
    
}
