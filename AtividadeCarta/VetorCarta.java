/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AtividadeCarta;

import java.util.*;
// Contém a estrutura de coleções, classes de coleção herdadas, modelo de evento, 
// instalações de data e hora, internacionalização e utilidade diversa classes

public class VetorCarta {

    public static void main(String[] args) {
        ClassCarta[] cartas = new ClassCarta[52];
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = new ClassCarta();
        }
        for (int i = 0; i < cartas.length; i++) {
            cartas[i].imprimir();

        }
        ArrayList<ClassCarta> carta= new ArrayList<ClassCarta>();
        // O tamanho de uma matriz não pode ser modificado.

  

        for (int i = 0; i < carta.size(); i++) {
            carta.get(i).imprimir();
            //Para acessar um elemento no,use o método
            //e consulte o número de índice: NomeVarivel.get()
        }
        carta.remove(1);
        // Para remover um elemento, 
        // use o método e consulte o número de índice: NomeVariável.remove()

        for (int i = 0; i < carta.size(); i++) {
            // use o método para especificar, 
            // quantas vezes o loop deve ser executado: NomeVariável.size() 

            carta.get(i).imprimir();
        }
    }

}
