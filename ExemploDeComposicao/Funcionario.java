package ExemploDeComposicao;

public class Funcionario {
    private String name;
    private double salario;

    public Funcionario(String name, double salario)
    {
        this.name  = name;
        this.salario = salario;
    }

    public void setName(String name)
{
   if(this.name != null)
   {
       this.name = name;
   }else{
       System.out.println("Nome não preenchido!");
   }
}

  public String getName()
  {
      return name;
  }

  public void setSalario(double salario)
  {
   this.salario = salario;
  }
  
    public double getSalario()
    {
        return salario;
    }
   
}
