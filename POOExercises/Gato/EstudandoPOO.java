/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package POOExercises.Gato;

import java.util.*;
import javax.swing.*;

/**
 *
 * @author gusta
 */
public class EstudandoPOO {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        Gato s1, s2, s3, s4;
        s1 = new Gato("Felpudo", "White", 23f, 2f);
        s2 = new Gato("Frajola", "Black", 21f, 30f);
        s3 = new Gato("Tom", "Gray", 2f, 19f);
        s4 = new Gato("Garfield", "Orange", 12f, 29f);

        s1.desenha();
        s2.desenha();
        s3.desenha();
        s4.desenha();

        System.out.println("Você quer que seu gato mie ou corra ?");
        String saida = leia.nextLine();

        if (saida.equalsIgnoreCase("mie")) {
            s2.miar();
        } else if (saida.equalsIgnoreCase("corra")) {
            s2.correr();
        }

    }
}
