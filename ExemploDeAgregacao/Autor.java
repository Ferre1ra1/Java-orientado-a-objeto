package ExemploDeAgregacao;

public class Autor {
    private String email, nome, telefone;

    public Autor(String nome, String telefone, String email) 
    {
    this.nome = nome;
    this.telefone = telefone;
    this.email = email;
    }

    public void setNome(String name)
    {
        this.nome = name;
    }

    public String getNome() 
    {
        return nome;
    }
    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    
}
