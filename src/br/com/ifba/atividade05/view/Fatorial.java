/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade05.view;

/**
 *
 * @author Italo
 */
public class Fatorial {
     // Valor informado pelo usuário
    private int valor;

    /**
     * Define o valor para o cálculo do fatorial.
     * param n número inteiro fornecido pelo usuário
     */
    public void setValor(int n) {
        this.valor = n;
    }

    /**
     * Calcula e retorna o fatorial do valor definido.
     * return resultado do fatorial
     */
    public int getFatorial() {
        int resultado = 1;
        for (int i = valor; i >= 1; i--) {
            resultado *= i;
        }
        return resultado;
    }

    /**
     * Gera a fórmula de multiplicação em formato de texto.
     * Exemplo: para 5 retorna "5 x 4 x 3 x 2 x 1 ="
     * return String com a fórmula
     */
    public String getFormula() {
        StringBuilder formula = new StringBuilder();
        for (int i = valor; i >= 1; i--) {
            formula.append(i);
            if (i > 1) {
                formula.append(" x ");
            }
        }
        formula.append(" =");
        return formula.toString();
    }
}
