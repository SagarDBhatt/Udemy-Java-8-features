package Section2_CollectionFramework.LinkedList;

import java.util.*;

public class LSClass {

    public static void main(String[] args) {

        List<Integer> arrayList =  new ArrayList<Integer>();
        List<Integer> LinkedList = new LinkedList<Integer>();

        calcTimings("arrayList",arrayList);
        calcTimings("LinkedList",LinkedList);
    }

    private static void calcTimings(String type, List<Integer> list){
        for(int i=0;i<100000;i++){
            list.add(i);
        }

        long start =  System.currentTimeMillis();

        //Adding elements at the end of the list.
        /*for(int i=0;i<100000;i++){
            list.add(i);
        }*/

        //Adding elements at the beginning of the List.
       /* for(int i=0;i<100000;i++){
            list.add(0,i);
        }*/

       //Adding elements at the middle of the list
        for(int i=0;i<100000;i++) {
            list.add(list.size()/2,i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken by = " + type + " " + (end-start) + " ms");

    }


}
