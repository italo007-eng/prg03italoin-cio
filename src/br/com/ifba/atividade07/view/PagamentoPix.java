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
 * Pagamento via Pix: devolve 2% de cashback ao cliente.
 */
public class PagamentoPix implements Pagamento {
    // Valor original da compra
    private double valor;

    /**
     * Construtor que recebe o valor da compra.
     * @param valor valor original
     */
    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    /**
     * Calcula o total com 2% de cashback (desconto).
     * @return valor com cashback aplicado
     */
    @Override
    public double calcularTotal() {
        double cashback = valor * 0.02; // 2% de cashback
        return valor - cashback;
    }

    /**
     * Imprime o recibo do pagamento via Pix.
     */
    @Override
    public void imprimirRecibo() {
        System.out.println("=== RECIBO - PIX ===");
        System.out.println("Valor original: R$" + valor);
        System.out.println("Cashback (2%): R$" + (valor * 0.02));
        System.out.println("Valor final: R$" + calcularTotal());
        System.out.println("====================");
    }

    // Get e Set

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
