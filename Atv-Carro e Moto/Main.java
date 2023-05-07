public class Main {

    public static void main(String[] args) {
        Carro s1 = new Carro("HR-V", "HONDA", true, 70, 4);
 
        // carro = X1 BMW 
        // Trocando o modelo  
        String mdlo1 = s1.getModelo();
        s1.setModelo("X1");
        mdlo1 = s1.getModelo();
        System.out.println("Modelo: " + mdlo1);
        // Trocando a marca
        String mrc = s1.getMarca();
        s1.setMarca("BMW");
        mrc = s1.getMarca();
        System.out.println("Marca: " + mrc);
        System.out.println();

        s1.imprime();


        System.out.println("\n");

        Moto s2 = new Moto("RD 350", "YAMAHA", true, 70);
        // moto = AZ1 AVELLOZ
        // Trocando o modelo  
        String mdlo2 = s2.getModelo();
        s2.setModelo("AZ1");
        mdlo2 = s2.getModelo();
        System.out.println("Modelo: " + mdlo2);
        // Trocando a marca
        String mrc2 = s2.getMarca();
        s2.setMarca("AVELLOZ");
        mrc2 = s2.getMarca();
        System.out.println("Marca: " + mrc2);
        System.out.println();
 
        s2.imprime();
        System.out.println();

    }

}