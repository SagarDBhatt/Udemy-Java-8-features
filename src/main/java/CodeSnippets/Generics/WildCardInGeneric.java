package CodeSnippets.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardInGeneric {
    public static void main(String[] args) {

        //Integer type collection class
        List<Integer> listInteger = new ArrayList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        //Double type collection class with initializing the value.
        List<Double> listDouble = Arrays.asList(5.0, 6.0, 7.0);

        //printInteger(listInteger);
        //printDouble(listDouble);

        printGeneric(listInteger);
        printGeneric(listDouble);

    }//end of main()

    public static void printInteger(List<Integer> intList){
        for(Integer a : intList){
            System.out.println(" Objects === " + a);
        }
    }

    public static void printDouble(List<Double> doublesList){
        for(Double a : doublesList){
            System.out.println(" Objects === " + a);
        }
    }

    public static void printGeneric (List<?> Genericlist){
        for(Object a : Genericlist){
            System.out.println("Objects == " + a);
        }
    }

}//end of class
