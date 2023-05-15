package ClasseAbstrata;

public abstract class ClassAbs {
    protected int valor;    
    public ClassAbs(int valor)
    {
        this.valor = valor;
    }

     public abstract int getValor();
     public abstract int setValor(int valor);
}
