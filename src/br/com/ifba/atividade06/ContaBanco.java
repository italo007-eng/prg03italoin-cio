/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06;

/**
 *
 * @author Italo
 */
public class ContaBanco {
     // Número da conta
    private int numConta;

    // Tipo da conta: "cc" (corrente) ou "cp" (poupança)
    private String tipo;

    // Nome do dono da conta
    private String dono;

    // Saldo disponível na conta
    private double saldo;

    // Status da conta: false = fechada, true = aberta
    private boolean status;
    

    /**
     * Construtor: cria a conta com status fechado e saldo zero.
     * @param numConta número da conta
     * @param tipo tipo da conta ("cc" ou "cp")
     * @param dono nome do titular
     */
    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.status = false; // conta começa fechada
        this.saldo = 0;      // saldo começa zerado

        // Valida o tipo: só aceita "cc" ou "cp"
        if (tipo.equals("cc") || tipo.equals("cp")) {
            this.tipo = tipo;
        } else {
            this.tipo = "cc"; // valor padrão se inválido
        }

        this.dono = dono;
    }
    
    // MÉTODOS PRINCIPAIS

    /**
     * Abre a conta: muda status para true.
     * Se for cp, recebe R$150 de presente.
     * Se for cc, recebe R$50 de presente.
     */
    public void abrirConta() {
        this.status = true; // abre a conta

        // Deposita o presente conforme o tipo de conta
        if (this.tipo.equals("cp")) {
            this.saldo += 150; // presente para poupança
        } else {
            this.saldo += 50;  // presente para corrente
        }

        System.out.println("Conta aberta com sucesso! Saldo inicial: R$" + this.saldo);
    }

    /**
     * Fecha a conta: só funciona se a conta estiver aberta.
     * Jubileu e Creusa não podem fechar conta.
     */
    public void fecharConta() {
        // Verifica se o dono é Jubileu ou Creusa
        if (this.dono.equalsIgnoreCase("italo") || 
            this.dono.equalsIgnoreCase("jonata")) {
            System.out.println("italo e jonata nao podem fechar a conta!");
            return;
        }

        // Verifica se a conta está aberta
        if (this.status == true) {
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        } else {
            System.out.println("A conta já está fechada!");
        }
    }

    /**
     * Deposita um valor na conta.
     * Só funciona se a conta estiver aberta.
     * @param valor valor a depositar
     */
    public void depositar(double valor) {
        // Conta precisa estar aberta
        if (this.status == false) {
            System.out.println("Nao é possível depositar. Conta fechada!");
            return;
        }

        this.saldo += valor;
        System.out.println("Deposito de R$" + valor + " realizado. Saldo: R$" + this.saldo);
    }

    /**
     * Saca um valor da conta.
     * Conta precisa estar aberta e ter saldo suficiente.
     * @param valor valor a sacar
     */
    public void sacar(double valor) {
        // Conta precisa estar aberta
        if (this.status == false) {
            System.out.println("Nao é possível sacar. Conta fechada!");
            return;
        }

        // Saldo precisa ser suficiente
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente! Saldo atual: R$" + this.saldo);
            return;
        }

        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado. Saldo: R$" + this.saldo);
    }

    /**
     * Cobra a mensalidade diretamente do saldo.
     * cc paga R$12, cp paga R$20.
     */
    public void pagarMensal() {
        // Define o valor da mensalidade conforme o tipo
        if (this.tipo.equals("cc")) {
            this.saldo -= 12; // mensalidade corrente
            System.out.println("Mensalidade de R$12 cobrada. Saldo: R$" + this.saldo);
        } else {
            this.saldo -= 20; // mensalidade poupança
            System.out.println("Mensalidade de R$20 cobrada. Saldo: R$" + this.saldo);
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
