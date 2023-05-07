package AtvCarroeMotoComHeranca;
public class Veiculo {
    // Atributos
    protected String modelo;
    protected String marca;
    protected boolean ligado;
    protected float velocidade;

    // Constructor
    public Veiculo() {
        modelo = "";
        marca = "";
        ligado = false;
        velocidade = 0;
    }

    public Veiculo(String modelo, String marca){
        setModelo(modelo);
        setMarca(marca);
        ligado = false;
        velocidade  = 0;
    }
    // Metodos de acesso

    public void setModelo(String modelo){
        if(modelo != null) this.modelo = modelo;
    }

    public String getModelo()
    {return modelo;}

    public void setMarca(String marca){
        if(marca != null) this.marca = marca;
    }

    public String getMarca()
    {return marca;}

    public void ligar()
    {ligado = true;}
   
    public void desligar()
    {ligado = false;}
   
    public void acelerar()
    {if(ligado) velocidade += 5;}

    public void brecar()
    {velocidade -=10;
    if(velocidade < 0 ) {velocidade = 0;}
}
  public void imprime()
  {
   System.out.println(
    "Modelo: "+modelo+"\n"+ 
   "Marca: "+marca+"\n"+ 
   "ligado ?: "+ligado+"\n"+
   "Velocidade: "+velocidade);
  }

}
