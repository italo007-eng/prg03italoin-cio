/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author Italo
 */
public class Atividade06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Cria uma conta poupança para italo
    ContaBanco conta1 = new ContaBanco(1001, "cp", "italo");
    conta1.abrirConta();       // Abre e recebe R$150
    conta1.depositar(100);     // Deposita R$100
    conta1.sacar(50);          // Saca R$50
    conta1.pagarMensal();      // Paga R$20 de mensalidade
    conta1.fecharConta();      // Fecha a conta

    System.out.println("--------------------------------------");

    // Tenta fechar conta do Jonata (não pode!)
    ContaBanco conta2 = new ContaBanco(1002, "cc", "Jonata");
    conta2.abrirConta();       // Abre e recebe R$50
    conta2.fecharConta();      // Bloqueado!
    }
    
}
