
class Factorial {
    long computel(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++)
            result *=i;
        return result;
    }
    long computeR(int n) {
        if (n ==1) return n;
        return computeR(n - 1) * n;
    }
}
public class RecursionDemo {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Факториал, рассчитанный в цикле ");
        for (int i = 6; i > 0; i--) {
            System.out.println(i + "! = " + f.computeR(i));
        }
    }
}

