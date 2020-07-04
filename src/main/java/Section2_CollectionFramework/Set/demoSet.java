package Section2_CollectionFramework.Set;

import java.util.HashSet;
import java.util.Set;

public class demoSet {

    public static void main(String[] args) {
        Set aSet = new HashSet();   //Set interface provide only one argument<key> and not <key, value> pair.

        aSet.add("A");
        aSet.add("B");
        aSet.add("C");
        aSet.add("D");

        printSet(aSet,"HashSet");
    }

    public static void printSet(Set set, String type){
        System.out.println("For the type == " + type);
        System.out.println(set.toString());
    }
}
