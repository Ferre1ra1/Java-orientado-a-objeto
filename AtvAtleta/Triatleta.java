package AtvAtleta;
public class Triatleta implements ciclista, corredor, nadador {
    @Override
    public void aquecer() {
        System.out.println("Aquecendo");
    }

    @Override
    public void Pedalar() {
        System.out.println("Pedalando");
    }

    @Override
    public void Nadar() {
        System.out.println("Nadando");
    }

    @Override
    public void Correr() {
        System.out.println("Correndo");
    }

}
