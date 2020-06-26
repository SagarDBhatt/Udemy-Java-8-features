package CodeSnippets.Recursion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Factorial of 5 = " + factOfN(5));
    }///end of main

    public static int factOfN(int n){
        if(n>1){
            int fact = n * factOfN(n-1);
            return fact;
        }
        else
            return 1;
    }
}
