package AtvContaCorrenteEBancaria;

import java.util.*;

public class Contabacaria {
    Scanner leia = new Scanner(System.in);
    // saldo (double): representa o saldo da conta bancária
    double saldo;
    // numero (int): representa o número da conta bancária
    int numero;
    // titular (String): representa o nome do titular da conta bancária
    String titular;

    public Contabacaria() {
        saldo = 0.0;
        numero = 0;
        titular = "";
    }

    public Contabacaria(double saldo, int numero, String titular) {
        this.saldo = saldo;
        this.numero = numero;
        this.titular = titular;
    }

    // depositar(double valor): adiciona o valor ao saldo da conta bancária
    void depositar() {
        double valor;
        System.out.println("Quanto você deseja depositar ? ");
        valor = leia.nextDouble();
        System.out.println("Saldo atual : " + (valor + this.saldo) + " R$");

    }

    // sacar(double valor): subtrai o valor do saldo da conta bancária
    void sacar(double valor) {
        System.out.println("Quanto você deseja sacar ? ");
        valor = leia.nextDouble();
        System.out.println("Saldo atual : " + (valor - this.saldo) + " R$");

    }

    // imprimirSaldo(): imprime o saldo da conta bancária na tela
    void imprimirSaldo() {
        System.out.println("Titular da conta: " + this.titular +
                "\n" + "Número da conta: " + this.numero +
                "\n" +
                "Saldo: " + this.saldo);
    }
}
