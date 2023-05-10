package PilhaDinamica;
public class Node {
    // Atributes
    private Object dado;
    private Node proximo;

    // Construtor
    public Node(Object dado, Node proximo) {
        this.dado = dado;
        this.proximo = proximo;
    }

    // Método de acesso
    public void setDado(Object dado) {
        this.dado = dado;
    }

    public Object getDado() {
        return dado;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public Node getProximo() {
        return proximo;
    }

}
