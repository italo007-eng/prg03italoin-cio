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
 * Representa um triângulo (forma 2D).
 * Área = (base × altura) / 2
 */
public class Triangulo extends Forma2D{
    //base e altura do triangulo
    private double base;
    private double altura;
    
    //contrutor do triangulo
    public Triangulo(double base, double altura) {
        super("triangulo");
        this.base = base;
        this.altura = altura;
    }
    
    //Calcula a área do triângulo: (base × altura) / 2
    @Override
    public double obterArea(){
        return (base * altura) / 2;
    }
    
    //Descrição textual do triângulo.

    @Override
    public String toString() {
        return "forma: triangulo | base: " + base + " | altura: " + altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
