package AtvCarroeMotoComHeranca;
public class Moto1 extends Veiculo {
    // Constructor
    public Moto1() {
        super("CG", "Honda");
    }

    public Moto1(String modelo, String marca) {
        super(modelo, marca);
    }

    // override - sobrescrever
    public void acelerar() {
        if (ligado) {
            super.acelerar();
            velocidade += 10;
        }
    }

    public void buzinar() {
        System.out.println("Bi Bi Bi");
    }
}
