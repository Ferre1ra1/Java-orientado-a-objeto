package ExemploDeComposicao;
import java.util.List;

public class Departamento {
    String name;
    List<Funcionario> funcionario;

    public Departamento(String name, List<Funcionario> funcionario)
    {
        this.name = name;
        this.funcionario = funcionario;
    }    
 
     public void setName(String name)
     {
         if(this.name!=null) this.name= name;
     }
     public String getName()
     {
         return name;
     }

     public void setFuncionario(List<Funcionario> funcionario)
     {
         this.funcionario = funcionario;
     }
     public List<Funcionario> getFuncionario()
     {
         return funcionario;
     }
}
