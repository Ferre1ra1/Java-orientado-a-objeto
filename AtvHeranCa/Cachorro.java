package AtvHeranCa;

public class Cachorro extends Mamifero {
    private String raca;
    private String cor;

   
    public Cachorro(String raca,String name,String age,String TipoPelo,String Especie,  String cor) {
        super(name, age, TipoPelo,Especie);
        this.raca = raca;
        this.cor = cor;
    }

    public void imprime()
    {
        System.out.println
        (
        "O cachorro da raça "+this.raca+ " tem "+this.age+" anos" + " e tem uma cor "+this.cor+"\n"+"Seu nome é "+this.name+" e ele tem uma pelo "+this.TipoPelo + " e ele é da especie "+this.Especie
        );
        
    }

    public void latir()
    {
        System.out.println("AU AU AU");
    }


    public static void main(String[] args) {
        Cachorro s1 = new Cachorro("Salsicha", "Rodolfo","12","aspero","Baiano","Alaranjada");
        System.out.println("\n");
        s1.imprime();
        System.out.println("\n");
        s1.amamentar();
        s1.latir();
        s1.fazer_som();
    }
}
