package PilhaDinamica;

public class PilhaDin {
    private Node topo;

    public PilhaDin() {
        topo = null;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public Object top(){
        if(topo != null){
            return topo.getDado();
        }else{
            return -1;
        }
    }

    public void Push(Object dado) {
        topo = new Node(dado, topo);
    }

    public Object Pop() {
        Object temp = topo.getDado();
        topo = topo.getProximo();
        return temp;
    }

    public String toString() {
        String resp = "P[ ";
        Node temp = topo;
        while (temp != null) {
            resp += temp.getDado().toString() + " ";
            temp = temp.getProximo();
        }
        return resp + "]";
    }
}
