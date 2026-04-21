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
 * Classe abstrata que representa formas bidimensionais (2D).
 * Herda de Forma e exige implementação de obterArea().
 */
public abstract class Forma2D extends Forma {

    //Construtor que repassa o nome para a classe Forma.
    public Forma2D(String nome) {
        super(nome); // chama o construtor de Forma
    }
    /**
     * Calcula a área da forma bidimensional.
     * Cada subclasse implementa sua própria fórmula.
     * @return área da forma
     */
    public abstract double obterArea();
}
