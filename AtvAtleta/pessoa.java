package AtvAtleta;
public class pessoa {
    protected String nome;
    protected String endereco;

    public pessoa(String nome, String endereco) {
        this.nome = nome; 
        this.endereco = endereco;
    }
    public void setNome(String nome){this.nome = nome;}
    public void setEndereco(String endereco){this.endereco = endereco;}

    public  String getnome(){return nome;}
    public String getendereco(){return endereco;}


}
