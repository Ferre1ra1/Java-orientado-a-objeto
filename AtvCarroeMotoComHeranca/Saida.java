package AtvCarroeMotoComHeranca;
public class Saida {

    public static void main(String[] args) {
        Carro1 c1 = new Carro1();
        Carro1 c2 = new Carro1("HR-V", "HONDA", 4);
        Moto1 m1 = new Moto1();
        Moto1 m2 = new Moto1("RD 350", "YAMAHA");

        c1.ligar();
        c1.acelerar();
        c1.acelerar();
        c1.brecar();
      
        c2.toString();
       System.out.println();  
        m1.ligar();
        m1.acelerar();
        m1.acelerar();
        m2.toString();

    }

}