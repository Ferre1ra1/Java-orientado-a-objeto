package ClasseInterface;

public class Organizando implements ClassInterface {
    public static void main(String[] args) {

    }

    @Override
    public boolean isEmpty() {
        if (isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public boolean isFull() {
        if (!isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int soma(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public double subtracao(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double multiplicacao(double n1, double n2) {
        return n1 * n2;
    }
}
