/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Italo
 */
/**
 * Pagamento em dinheiro: aplica 10% de desconto no valor.
 */
public class PagamentoDinheiro implements Pagamento {
    // Valor original da compra
    private double valor;

    /**
     * Construtor que recebe o valor da compra.
     * @param valor valor original
     */
    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    /**
     * Calcula o total com 10% de desconto.
     * @return valor com desconto aplicado
     */
    @Override
    public double calcularTotal() {
        double desconto = valor * 0.10; // 10% de desconto
        return valor - desconto;
    }

    /**
     * Imprime o recibo do pagamento em dinheiro.
     */
    @Override
    public void imprimirRecibo() {
        System.out.println("=== RECIBO - DINHEIRO ===");
        System.out.println("Valor original: R$" + valor);
        System.out.println("Desconto (10%): R$" + (valor * 0.10));
        System.out.println("Valor final: R$" + calcularTotal());
        System.out.println("========================");
    }
    //get e set

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

}
