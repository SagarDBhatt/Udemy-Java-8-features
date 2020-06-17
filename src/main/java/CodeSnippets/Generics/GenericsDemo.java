package CodeSnippets.Generics;

public class GenericsDemo {

    public static void main(String[] args) {
        
    }

    public <T> void showValues( T[] t) {

        for(T input : t){
            System.out.println("Values = "+ input);
        }

    }

}
