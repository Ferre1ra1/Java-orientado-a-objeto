/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtvContaCorrenteEBancaria;

/**
 *
 * @author gusta
 */
public class Conta {

    String NomeConta;
    long NumeroConta;
    double Saldo;

    Conta(String NomeConta, long NumeroConta, double Saldo) {
        this.NomeConta = NomeConta;
        this.NumeroConta = NumeroConta;
        this.Saldo = Saldo;
    }

    void Imprimir() {
        System.out.println(
                "Nome da conta " + this.NomeConta + "\n" + "Número da conta: " + this.NumeroConta
                + "\n" + "Saldo atual: R$" + this.Saldo
        );
    }

    void Sacar() {
        double saque = 200;
        this.Saldo -= saque;
        System.out.print("Saque realizado, novo saldo R$" +this.Saldo);

    }

    void Depositar() {
        double mais = 500;
        this.Saldo += mais;
        System.out.print("Depósito concluído, novo saldo R$" + this.Saldo);

    }

}
