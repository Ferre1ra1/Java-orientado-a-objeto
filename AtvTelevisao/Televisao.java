package AtvTelevisao;
public class Televisao {

    int CanalTelevisao;
    String Marca;
    double Polegadas;

    Televisao(int CanalTelevisao, String Marca, double Polegadas) {
        this.CanalTelevisao = CanalTelevisao;
        this.Marca = Marca;
        this.Polegadas = Polegadas;
    }
    void AumentaCanal() {
        this.CanalTelevisao++;
    }
    void AbaixaCanal() {
        this.CanalTelevisao--;
    }
    void Imprimir() {
        System.out.println(
                "Canal: " + this.CanalTelevisao + "\n"
                + " Marca: " + this.Marca + "\n"
                + " Polegadas: " + this.Polegadas);
    }
}
