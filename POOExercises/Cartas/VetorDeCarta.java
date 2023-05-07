/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOExercises.Cartas;

import java.util.ArrayList;

/**
 *
 * @author gusta
 */
public class VetorDeCarta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criar vetor de objeto
        ClasseCarta[] cartas = new ClasseCarta[5];
        //Criar cartas aleatorias
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = new ClasseCarta();
        }
        for (int i = 0; i < cartas.length; i++) {
            cartas[i].imprimir();
        }
        System.out.println();

        System.out.println("Com array dinâmico ");
        // Array dinâmico
        ArrayList<ClasseCarta> cartas1 = new ArrayList<ClasseCarta>();
        cartas1.add(new ClasseCarta(1, 0));
        cartas1.add(new ClasseCarta(2, 0));
        cartas1.add(new ClasseCarta());

        for(int i = 0; i < cartas1.size(); i++)
        {
        cartas1.get(i).imprimir();
        }
        cartas1.remove(1);
        for(int i = 0; i < cartas1.size(); i++)
        {
        cartas1.get(i).imprimir();
        }
    }
    

}
