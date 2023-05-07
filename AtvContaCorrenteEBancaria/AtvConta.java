/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package AtvContaCorrenteEBancaria;

/**
 *
 * @author gusta
 */
public class AtvConta {

    public static void main(String[] args) {
        Conta saida = new Conta("Gustavo Ferreira Vargens", 123456, 1200);

        saida.Imprimir();
        System.out.println();
        saida.Sacar();
        System.out.println("\n");
        saida.Depositar();
    }
}
