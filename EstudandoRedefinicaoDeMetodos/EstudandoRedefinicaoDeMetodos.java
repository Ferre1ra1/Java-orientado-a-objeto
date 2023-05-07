/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package EstudandoRedefinicaoDeMetodos;

/**
 *
 * @author gusta
 */
public class EstudandoRedefinicaoDeMetodos extends ClasseRedefinicaoDeMetodos {


    @Override
    public String toString() {
       return "teste";
    }

    public static void main(String[] args) {
            ClasseRedefinicaoDeMetodos saida = new ClasseRedefinicaoDeMetodos("23232", "Ford", 2015, 20520);

          EstudandoRedefinicaoDeMetodos teste1 = new EstudandoRedefinicaoDeMetodos();
          System.out.println(teste1.toString());
           
          System.out.println(saida.toString());
    
    }
}
