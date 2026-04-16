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
 * Pagamento com cartão: aplica taxa de 5% no valor.
 */
public class PagamentoCartao implements Pagamento {
      // Valor original da compra
    private double valor;

    /**
     * Construtor que recebe o valor da compra.
     * @param valor valor original
     */
    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    /**
     * Calcula o total com taxa de 5%.
     * @return valor com taxa aplicada
     */
    @Override
    public double calcularTotal() {
        double taxa = valor * 0.05; // 5% de taxa
        return valor + taxa;
    }

    /**
     * Imprime o recibo do pagamento com cartão.
     */
    @Override
    public void imprimirRecibo() {
        System.out.println("=== RECIBO - CARTÃO ===");
        System.out.println("Valor original: R$" + valor);
        System.out.println("Taxa (5%): R$" + (valor * 0.05));
        System.out.println("Valor final: R$" + calcularTotal());
        System.out.println("=======================");
    }

    // Get e Set

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
