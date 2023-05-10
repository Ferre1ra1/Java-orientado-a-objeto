package PilhaDinamica;
public class TestaNode {
    public static void main(String[] args) {
        Node n1 = new Node(10, null);
        Node temp = new Node(5, null);

        temp.setProximo(n1);
        n1 = temp;
        n1 = new Node(9, n1);

        temp = n1;
        while (temp.getProximo() != null)
            temp = temp.getProximo();
        temp.setProximo(new Node(8, null));

        //remover o topo - n1 = n1.getProximo();
    }
}
