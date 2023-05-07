package AtvCarroeMotoComHeranca;

public class Carro1 extends Veiculo {
    private int qtdPortas;

    // Constructor
    public Carro1() {
        super("147", "Fiat");
        qtdPortas = 2;
    }

    public Carro1(String modelo, String marca, int qtdPortas) {
        super(modelo, marca);
        setQtdPortas(qtdPortas);
    }

    public void setQtdPortas(int qtdPortas) {
        if (qtdPortas > 0 && qtdPortas <= 6) {
            this.qtdPortas = qtdPortas;
        }
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    // override -> sobrescrever
    public String toString() {
        return "Modelo: " + modelo + "\n" +
                "Marca: " + marca + "\n" +
                "ligado ?: " + ligado + "\n" +
                "Velocidade: " + velocidade;
    }
}