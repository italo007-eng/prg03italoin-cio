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
 * Representa um quadrado (forma 2D).
 * Área = lado²
 */
public class Quadrado extends Forma2D {
   // Tamanho do lado
    private double lado;

    /**
     * Construtor do quadrado.
     * @param lado tamanho do lado
     */
    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    /**
     * Calcula a área do quadrado: lado²
     * @return área do quadrado
     */
    @Override
    public double obterArea() {
        return lado * lado;
    }

    /**
     * Descrição textual do quadrado.
     * @return 
     */
    @Override
    public String toString() {
        return "Forma: Quadrado | Lado: " + lado;
    }

    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }
    
}
