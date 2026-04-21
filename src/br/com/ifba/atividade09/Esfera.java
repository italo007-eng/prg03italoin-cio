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
 * Representa uma esfera (forma 3D).
 * Área = 4 × π × raio²
 * Volume = (4/3) × π × raio³
 */
public class Esfera extends Forma3D {
    // Raio da esfera
    private double raio;

    /**
     * Construtor da esfera.
     * @param raio raio da esfera
     */
    public Esfera(double raio) {
        super("Esfera");
        this.raio = raio;
    }

    /**
     * Calcula a área da superfície da esfera: 4 × π × raio²
     */
    @Override
    public double obterArea() {
        return 4 * Math.PI * raio * raio;
    }

    /**
     * Calcula o volume da esfera: (4/3) × π × raio³
     */
    @Override
    public double obterVolume() {
        return (4.0 / 3.0) * Math.PI * raio * raio * raio;
    }

    /**
     * Descrição textual da esfera.
     * @return 
     */
    @Override
    public String toString() {
        return "Forma: Esfera | Raio: " + raio;
    }

    public double getRaio() { return raio; }
    public void setRaio(double raio) { this.raio = raio; }
    
    
}
