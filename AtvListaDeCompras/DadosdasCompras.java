package AtvListaDeCompras;

public class DadosdasCompras {
    String produto;
    int Qtde;
    double price;

    public DadosdasCompras(String produto, int Qtde, double price) {
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
