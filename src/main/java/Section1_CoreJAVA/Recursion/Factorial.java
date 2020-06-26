package Section1_CoreJAVA.Recursion;

public class Factorial {

    static {
        System.out.println("Static Block");
    }

    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + factOfN(5));

        System.out.print(n1 + " " + n2 + " ");
        fibonaci(5);

    }///end of main

    public static int factOfN(int n) {
        if (n > 1) {
            int fact = n * factOfN(n - 1);
            return fact;
        } else
            return 1;
    }

    public static void fibonaci(int terms) {

        if (terms > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            // terms--;
            System.out.print(n3 + " ");
            fibonaci(terms - 1);
        }

    }
}
