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
 * Representa um cubo (forma 3D).
 * Área = 6 × lado²
 * Volume = lado³
 */
public class Cubo extends Forma3D {
   // Tamanho do lado do cubo
    private double lado;

    /**
     * Construtor do cubo.
     * @param lado tamanho do lado
     */
    public Cubo(double lado) {
        super("Cubo");
        this.lado = lado;
    }

    /**
     * Calcula a área da superfície do cubo: 6 × lado²
     */
    @Override
    public double obterArea() {
        return 6 * lado * lado;
    }

    /**
     * Calcula o volume do cubo: lado³
     */
    @Override
    public double obterVolume() {
        return lado * lado * lado;
    }

    /**
     * Descrição textual do cubo.
     * @return 
     */
    @Override
    public String toString() {
        return "Forma: Cubo | Lado: " + lado;
    }

    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }

}
