package AtvUsandoVetorDeObjetos;

public class Main {
    public static void main(String[] args) {
        Dados[] saida = new Dados[5];

        saida[0] = new Dados("Banana", 4, 20);
        saida[1] = new Dados("Maçã", 20, 12);
        saida[2] = new Dados("Melão", 2, 2);
        saida[3] = new Dados("Cajú", 10, 14);
        saida[4] = new Dados("Uva", 3, 11);

        System.out.println(saida[0].toString());
        System.out.println();
        System.out.println(saida[1].toString());
        System.out.println();
        System.out.println(saida[2].toString());
        System.out.println();
        System.out.println(saida[3].toString());
        System.out.println();
        System.out.println(saida[4].toString());

    }

}
