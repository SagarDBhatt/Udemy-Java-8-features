package Section2_CollectionFramework.ArrayLs;

import java.awt.*;
import java.util.ArrayList;

public class ArrayListClass {

    public static void main(String[] args) {

        //Initialize an ArrayList. Dev provided Wrapper class "Integer" to describe that the ArrayList is of type Integer.
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //Adding value to the ArrayList. Here, Size of the "numbers" is 4. (Index 0, 1, 2, 3)
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);

        //There are two ways of printing the value of the ArrayList
        // 1. Using For loop

        System.out.println("\n Iteration 1");
        /**
         * Here, numbers.get(i) method provide the value at the index "i".
         */
        for(int i=0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        // 2. Advanced for loop
        System.out.println("\n Iteration 2");

        /**
         * Advanced for loop, Iterate variable of type Integer of all the values.
         */
        for(Integer a : numbers){
            System.out.println(a);
        }




    }
}
