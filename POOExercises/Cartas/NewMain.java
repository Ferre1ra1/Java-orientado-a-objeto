/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOExercises.Cartas;

/**
 *
 * @author gusta
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasseCarta s1, s2;

        s1 = new ClasseCarta();
        s2 = new ClasseCarta(10, 0);

        System.out.println(s1.getFace() + " " + s1.getNaipe());
        s1.imprimir();

//        s2.imprimir();
//        s2.VirarCarta();
//        s2.imprimir();

    }

}
