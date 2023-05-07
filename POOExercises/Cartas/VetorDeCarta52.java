/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOExercises.Cartas;
import java.util.*;
/**
 *
 * @author gusta
 */
public class VetorDeCarta52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<ClasseCarta> baralho = new ArrayList<ClasseCarta>();
        baralho.add(new ClasseCarta());
        for (int i = 0; i < 52; i++) {
            ClasseCarta carta = new ClasseCarta();
            boolean ok = true;
            while (ok && baralho.size() < 52) {
                ok = false;
                for (int j = 0; j < baralho.size(); j++) {
                    if (carta.getFace() == baralho.get(j).getFace() && carta.getNaipe() == baralho.get(j).getNaipe()) {
                        carta = new ClasseCarta();
                        ok = true;
                    }
                }
            }
            baralho.add(carta);
            carta.imprimir();
        }
    }
    
}
