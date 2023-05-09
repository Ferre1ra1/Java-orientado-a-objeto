
public class Carro extends Motor {
    // @override
//oiooioi
    double x, velocidade;

    public Carro(double velocidade, double x, String cor, double diametro, double potencia) {
        super(cor, potencia, diametro);
        this.x = x;
        this.velocidade = velocidade;
    }

    public void Acelerar() {
        System.out.println("Motor ligado, luz " + Ligar());
    }

    public void Brecar() {
        System.out.println("Motor desligado, luz " + Desligar());
    }

    public void Acelerar(double potencia) {
        this.velocidade = potencia += 5;
        System.out.println("velocidade aumentando: " + this.velocidade);
    }

    public void Brecar(double potencia) {
        this.velocidade = potencia -= 5;
        System.out.print("Velocidade diminuindo: " + this.velocidade);
    }

    public void Atualiza(){
        this.x += this.velocidade;
        System.out.println("X atualizando: "+this.x);
    }

    public String toString() {
        return "Velocidade do Palio: " + this.velocidade +
                "\n" + "Valor de x: " + this.x + "\n" +
                "Cor da luz: " + this.cor + "\n" +
                "Diametro do motor: " + this.diametro + "\n" +
                "Potência do motor: " + this.potencia;
    }
}
