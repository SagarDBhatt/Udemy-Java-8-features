package Section2_CollectionFramework.Iterable;

import java.util.Iterator;
import java.util.LinkedList;

public class demo {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        for(int i=1; i<=4;i++)
            list.add(i);

        // Java 5 and later version has foreach loop.
        for(Integer val : list){
            System.out.println("List value = " + val);

            if(val == 2){
                list.remove(val);
            }
        }

        //==========================================================
        // Iterator interface
        Iterator<Integer> itrt = list.iterator();

        while(itrt.hasNext())
            System.out.println(itrt.next());

    }
}
