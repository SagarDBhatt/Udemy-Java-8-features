package Section2_CollectionFramework.Hashmap;

import java.io.ObjectInputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map lsMap = new LinkedHashMap();
        Map treeMap = new TreeMap();


        lsMap.put(2,"Two");
        lsMap.put(4,"Four");
        lsMap.put(1,"One");
        lsMap.put(3,"Three");

        /**
         * LinkedHashMap retain the order at which elements are entered. i.e. 2,4,1,3
         */
        printMap("LinkedHashMap", lsMap);
        System.out.println();

        treeMap.put(2,"Two");
        treeMap.put(4,"Four");
        treeMap.put(1,"One");
        treeMap.put(3,"Three");

        /**
         * TreeMap sorts the elements by Key on their natural order i.e. for int = 1,2,3,4.. For String = a,b,c,d,...
         */
        printMap("TreeMap", treeMap);
    }

    public static void printMap(String type, Map map){

        System.out.println(type);
        for(Object m : map.keySet()){
            System.out.println(m + " : " + map.get(m));
        }
    }
}
