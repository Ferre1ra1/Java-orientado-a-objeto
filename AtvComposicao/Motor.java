public class Motor {
    //@Override
    
    String cor;
    double potencia, diametro;

    public Motor() {
        double diametro, potencia = 0;
        String cor = "";
    }

    public Motor(String cor, double potencia, double diametro) {
        this.cor = cor;
        this.potencia = potencia;
        this.diametro = diametro;
    }

    public String Ligar() {
        return "verde";
    }

    public String Desligar() {
        return "vermelho";
    }

    public String ToString() {
        return "Diametro do motor: " + this.diametro +
                "\n" + "Cor mudada: " + Ligar() + "\n" +
                "Potência do motor " + this.potencia;
    }
}
