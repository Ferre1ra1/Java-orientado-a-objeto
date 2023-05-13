package ExemploDeComposicao;

public class Empresa {
  String name,cnpj;
  Departamento departamento;

   public Empresa(String name,String cnpj, Departamento departamento)
   {
       this.name = name;
       this.cnpj = cnpj;
       this.departamento = departamento;
   }

  public void setName(String name)
  {
      if(this.name != null) this.name = name;
  }

  public String getName()
  {
      return name;
  }
  public void setCpnj(String cnpj)
  {
      if(this.cnpj != null) this.cnpj = cnpj;
  }

  public String getCnpj()
  {
      return cnpj;
  }

  public void setDepartamento(Departamento departamento)
  {
      this.departamento = departamento;
  }

  public Departamento getDepartamento()
  {
      return departamento;
  }

}