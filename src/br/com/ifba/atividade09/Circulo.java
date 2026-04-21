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
 * Representa um círculo (forma 2D).
 * Área = π × raio²
 */
public class Circulo extends Forma2D{
     // Raio do círculo
    private double raio;

    /**
     * Construtor do círculo.
     * @param raio raio do círculo
     */
    public Circulo(double raio) {
        super("Circulo"); // define o nome
        this.raio = raio;
    }

    /**
     * Calcula a área do círculo: π × raio²
     * @return área do círculo
     */
    @Override
    public double obterArea() {
        return Math.PI * raio * raio;
    }

    /**
     * Descrição textual do círculo.
     * @return 
     */
    @Override
    public String toString() {
        return "Forma: Circulo | Raio: " + raio;
    }

    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }
    
}
