package Section2_CollectionFramework.NaturalOrdering;

import java.util.Collection;

public class OrderingMethods {

    public static void addElement(Collection<String> collection){
        collection.add("Aam");
        collection.add("Baman");
        collection.add("CamTheRam");
        collection.add("DammIt");
        collection.add("EatMe");
    }

    public static void showElement(Collection<String> collection){
        for(String str : collection){
            System.out.println(str);
        }
    }

}
