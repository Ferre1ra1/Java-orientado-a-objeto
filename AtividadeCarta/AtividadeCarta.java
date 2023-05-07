/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package AtividadeCarta;

/**
 *
 * @author gusta
 */
public class AtividadeCarta {

    public static void main(String[] args) {
        ClassCarta saida, saida2;
        saida = new ClassCarta();
        saida2 = new ClassCarta(0,0);
    
//        System.out.println(saida.GetNaipe() + " " + saida.GetFace());
//        saida.imprimir();
        
        System.out.println("\n");
        saida2.imprimir();
        saida2.VirarCarta();
        saida.imprimir();
        

    }
}
