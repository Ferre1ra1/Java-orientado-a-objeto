public class Carro {
    private String modelo;
    private String marca;
    boolean ligado;
    float velocidade;
    private int qtdPortas;

    Carro(String modelo, String marca, boolean ligado, float velocidade, int qtdPortas) {
        this.modelo = modelo;
        this.marca = marca;
        this.ligado = ligado;
        this.velocidade = velocidade;
        this.qtdPortas = qtdPortas;
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

    public void setqtdPortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public int getqtdPortas() {
        return this.qtdPortas;
    }

    void ligar() {
        this.ligado = true;
        System.out.println("Carro ligando...");

    }

    void desligar() {
        this.ligado = false;
        System.out.println("Motor desligado");
    }

    void acelerar() {
        this.velocidade += 5;
    }

    void brecar() {
        System.out.println("Freando");
        this.velocidade -= 10;
        if (this.velocidade <= 0) {
            System.out.println("Carro parado");
        }
    }

    void imprime(){
        ligar();
        System.out.println("Carro acelerando.." +this.velocidade+" Km/h");
        acelerar();
        System.out.println("Carro acelerando mais.." +this.velocidade+" Km/h");
        brecar();
        System.out.println("Velocidade reduzida.." +this.velocidade+" Km/h");
       desligar();
    }
}