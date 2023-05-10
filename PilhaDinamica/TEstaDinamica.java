package PilhaDinamica;

public class TEstaDinamica {
    public static void main(String[] args) {
        PilhaDin p1 = new PilhaDin();
        p1.Push(7);
        p1.Push(12);
        p1.Push(2);
        p1.Push(11);
        System.out.println(p1.toString());
        System.out.println(p1.Pop());
        System.out.println(p1.toString());



    }
}
