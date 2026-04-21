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
 * Representa uma pirâmide de base quadrada (forma 3D).
 * Área = base² + 2 × base × altura lateral
 * Volume = (base² × altura) / 3
 */
public class Piramide extends Forma3D {
   // Base e altura da pirâmide
    private double base;
    private double altura;

    /**
     * Construtor da pirâmide.
     * @param base lado da base quadrada
     * @param altura altura da pirâmide
     */
    public Piramide(double base, double altura) {
        super("Piramide");
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula a área da superfície da pirâmide.
     * Área lateral = 2 × base × altura lateral
     * Altura lateral = √((base/2)² + altura²)
     */
    @Override
    public double obterArea() {
        // Calcula a altura lateral (apótema da face)
        double alturaLateral = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        return (base * base) + (2 * base * alturaLateral);
    }

    /**
     * Calcula o volume da pirâmide: (base² × altura) / 3
     */
    @Override
    public double obterVolume() {
        return (base * base * altura) / 3;
    }

    /**
     * Descrição textual da pirâmide.
     * @return 
     */
    @Override
    public String toString() {
        return "Forma: Piramide | Base: " + base + " | Altura: " + altura;
    }

    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
     
}
