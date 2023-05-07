package AtvContaCorrenteEBancaria;

import java.util.*;

public class ContaCorrente extends Contabacaria {
    Scanner leia = new Scanner(System.in);
    // limite (double): representa o limite de crédito da conta corrente
    double limite;

    public ContaCorrente(String titular, int numero, double saldo, double limite) {
        super(saldo, numero, titular);
        this.limite = limite;
    }

    // imprimirLimite(): imprime o limite de crédito da conta corrente na tela
    void imprimirLimite() {
        System.out.println("Qual será o limite de crédito? ");
        this.limite = leia.nextDouble();
    }

    // usarLimite(double valor): adiciona o valor ao saldo da conta corrente, desde
    // que o valor não exceda o limite de crédito
    void UsarLimite() {
        System.out.println("Adicione o valor ao saldo da conta corrente ");
        double valor = leia.nextDouble();
        double total = valor + this.saldo;
        if (total > this.limite) {
            System.out.println("limite de crédito excedido");

        } else {

            System.out.println("Saldo atual : " + total + " R$");

        }
    }

}
