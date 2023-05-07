package AtvHeranCa;

public class Mamifero extends Animal {
    // Atributes
    protected String TipoPelo;
    protected String Especie;

    // Constructor
    public Mamifero(String name, String age, String TipoPelo, String Especie) {
        super(name, age);
        this.TipoPelo = TipoPelo;
        this.Especie = Especie;
    }

    // Methods
    public void amamentar() {
        System.out.println("O mamífero está amamentando");
    }
}
