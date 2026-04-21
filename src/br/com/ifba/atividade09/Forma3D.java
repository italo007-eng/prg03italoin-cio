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
 * Classe abstrata que representa formas tridimensionais (3D).
 * Herda de Forma e exige implementação de obterArea() e obterVolume().
 */
public abstract class Forma3D extends Forma {

    //Construtor que repassa o nome para a classe Forma.
    public Forma3D(String nome) {
        super(nome); // chama o construtor de Forma
    }
    /**
     * Calcula a área da superfície da forma 3D.
     * @return área da superfície
     */
    public abstract double obterArea();
    
     /**
     * Calcula o volume da forma 3D.
     * @return volume da forma
     */
    public abstract double obterVolume();
    
    
    
}
