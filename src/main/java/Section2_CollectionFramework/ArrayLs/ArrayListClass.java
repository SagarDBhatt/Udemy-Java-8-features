package Section2_CollectionFramework.ArrayLs;

import java.util.*;

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

        //Remove an element from ArrayList.
        numbers.remove(0);
        System.out.println("\n After Removing the first element.");
        for(Integer a : numbers){
            System.out.println(a);
        }

        //List Interface to initialize the ArrayList. At right size of the "=" should be ArrayList OR LinkedList.
        List<Integer> alist = new ArrayList<Integer>();
        //List alist = new ArrayList();

        alist.add(8);
        alist.add(12);
        alist.add(16);
        alist.add(4);
        alist.add(2);

// Sorting the ArrayList using Collection.Sort method and Arrays.sort methos.
        System.out.println();
        System.out.println("=============");
        for(Integer a: alist){
            System.out.println(a);
        }

// Sort the arrayList and print the objects.
        Collections.sort(alist);
        System.out.println("After Collections. Sort");

        for(Integer b:alist){
            System.out.println(b);
        }


    }
}

