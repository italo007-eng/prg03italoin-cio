/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Italo
 */
/**
 * Interface que define o contrato para todos os tipos de pagamento.
 * Toda classe de pagamento DEVE implementar esses dois métodos.
 */
public interface Pagamento {
     /**
     * Calcula o valor total após aplicar desconto, taxa ou cashback.
     * @return valor final como double
     */
        public double calcularTotal();

     /**
     * Imprime o recibo do pagamento no console.
     */
        public void imprimirRecibo();

}
