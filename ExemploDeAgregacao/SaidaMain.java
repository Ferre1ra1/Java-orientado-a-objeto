package ExemploDeAgregacao;

public class SaidaMain {
    public static void main(String[] args) {
        Autor autor = new Autor("Gustavo", "9392912", "gustavo@gmail.com");

        Livro lvl = new Livro("O poder do agora", autor, 2023, 312);

        System.out.println("Título:  " + lvl.getTitulo() + "\n" + "Ano de publicação: " + lvl.getAnoPublicacao() + "\n"
                + "Número de páginas: " + lvl.getNumeroPaginas());
        System.out.println(
                "Contato:  " + lvl.getAutor().getNome()
                        + "\n" + "Telefone: " + lvl.getAutor().getTelefone()
                        + "\n" + "Email: " + lvl.getAutor().getEmail());

    }
}
