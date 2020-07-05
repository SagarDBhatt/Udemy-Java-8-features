package Section2_CollectionFramework.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class demoSet {

    public static void main(String[] args) {

        //HashSet implementation of Set interface:
        Set aSet = new HashSet();   //Set interface provide only one argument<key> and not <key, value> pair.

        aSet.add("A");
        aSet.add("B");
        aSet.add("C");
        aSet.add("D");

//        printSet(aSet,"HashSet");

        //LinkedHash Set :: To maintain an order of insertion of the objects.
        Set<Integer> linkedSet = new LinkedHashSet<Integer>();

        linkedSet.add(8);
        linkedSet.add(20);
        linkedSet.add(4);
        linkedSet.add(1);

//        printSet(linkedSet,"LinkedHashSet");

        //TreeSet : To sort the objects based on their natural order i,e, 1,2,3,4... and a,b,c,d,e...

        Set<Integer> treeSet = new TreeSet<Integer>();

        treeSet.add(10);
        treeSet.add(9);
        treeSet.add(24);
        treeSet.add(16);

        printSet(treeSet,"TreeSet");


    }

    public static void printSet(Set set, String type){
        System.out.println("For the type == " + type);
        System.out.println(set.toString());
    }
}
