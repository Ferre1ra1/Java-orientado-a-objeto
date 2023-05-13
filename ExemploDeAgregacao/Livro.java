package ExemploDeAgregacao;

public class Livro {

    private String titulo;
    private Autor autor;
    private int anoPublicacao;
    private int NumeroPaginas;

   public Livro(String titulo, Autor autor, int anoPublicacao, int NumeroPaginas) 
   {
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;   
    this.NumeroPaginas = NumeroPaginas;
   }
     
   public void setTitulo(String titulo) 
   {
       if(this.titulo != null) this.titulo= titulo;
   }
   public String getTitulo()
   {
       return this.titulo;
   }

   public void setAutor(Autor autor)
   {
       this.autor = autor;
   }

   public Autor getAutor()
   {
       return autor;
   }

   public void setAnoPublicacao(int AnoPublicacao)
   {
       this.anoPublicacao = AnoPublicacao;
   }

   public int getAnoPublicacao() 
   {
       return anoPublicacao;
   }
   public void setNumeroPaginas(int NumeroPaginas)
   {
       this.NumeroPaginas = NumeroPaginas;
   }

   public int getNumeroPaginas() 
   {
       return NumeroPaginas;
   }

}
