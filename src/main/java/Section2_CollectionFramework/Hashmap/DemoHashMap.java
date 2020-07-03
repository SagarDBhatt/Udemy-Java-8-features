package Section2_CollectionFramework.Hashmap;

import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");

        System.out.println(map.get(1));

        /**
         * Print key and value of the HashMap.
         */
        for(Integer i : map.keySet()){
            //System.out.println("Keys == " + i);
            System.out.println(i + " : " + map.get(i));
        }

        //To remove an element. Provide key to remove that data from HashMap.
        map.remove(3);
        System.out.println("Remove Key = 3");

    }
}
