package AtvUsandoVetorDeObjetos;

public class Dados {
    String produto;
    int Qtde;
    double price;

    Dados(String produto, int Qtde, double price) {
        this.produto = produto;
        this.Qtde = Qtde;
        this.price = price;
    }

    public String toString() {
        return "Produto: " + this.produto + "\n" +
                "Preço: " + this.price + "R$"+"\n" +
                "Quantidade: " + this.Qtde;
    }
}
