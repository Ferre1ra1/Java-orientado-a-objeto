public class Moto {
    private String modelo;
    private String marca;
    boolean ligado;
    float velocidade;

    Moto(String modelo, String marca, boolean ligado, float velocidade) {
        this.modelo = modelo;
        this.marca = marca;
        this.ligado = ligado;
        this.velocidade = velocidade;
    }

    // Método 'set' é usado para definir ou alterar o valor de uma propriedade
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método get é usado para obter o valor atual de uma propriedade
    public String getModelo() {
        return this.modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return this.marca;
    }

    void ligar() {
        this.ligado = true;
        System.out.println("Moto ligando...");

    }

    void desligar() {
        this.ligado = false;
        System.out.println("Motor desligado");
    }

    void acelerar() {
        this.velocidade += 10;
    }

    void brecar() {
        this.velocidade -= 10;
        if (this.velocidade <= 0) {
            System.out.println("Moto parado");
        }
    }

    void buzinar() {

        System.out.println("BI BI!!! ");
    }

    void imprime() {
        ligar();
        System.out.println("Moto acelerando.." +this.velocidade+" Km/h");
        acelerar();
        System.out.println("Moto acelerando mais.." +this.velocidade+" Km/h");
        brecar();
        System.out.println("Velocidade reduzida.." +this.velocidade+" Km/h");
        buzinar();
    }
}
