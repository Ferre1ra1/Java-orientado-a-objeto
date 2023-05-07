package AtvTelevisao;
public class AtvTelevisao {
    public static void main(String[] args) {
        Televisao saida = new Televisao(5, "LG", 21.5);
        saida.AumentaCanal();
        saida.Imprimir();
        System.out.println();
        saida.AbaixaCanal();
        saida.Imprimir();
    }
}
