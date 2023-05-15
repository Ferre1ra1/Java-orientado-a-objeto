package ClasseInterface;

public class MainInter{
    public static void main(String[] args) {
        ClassInterface saida = new Organizando();
        System.out.println( "O resultado da soma é " +saida.soma(5, 5) );
        System.out.println("O resultado da multiplicação é " +saida.multiplicacao(10,5));
        System.out.println("O resultado da subtração é " +saida.subtracao(10,5)); 

    }
}
