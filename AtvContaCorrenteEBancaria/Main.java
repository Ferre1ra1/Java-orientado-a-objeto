package AtvContaCorrenteEBancaria;

public class Main {
    public static void main(String[] args) {
        Contabacaria s1;
        s1 = new Contabacaria(2000,123,"André");
        
        ContaCorrente s2;
        s2 = new ContaCorrente("",0,0,0);
        
        s1.imprimirSaldo();
         s1.depositar();
        s2.imprimirLimite();
        s2.UsarLimite();
    }
}
