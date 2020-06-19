package CodeSnippets.Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardCharacterInGenerics {

    public static void main(String[] args) {
        WildCardCharacterInGenerics object = new WildCardCharacterInGenerics();
        Machine aMachine = new Machine();
        Camera aCamera = new Camera();

        object.getObject(aMachine);
        object.getObject(aCamera);

        /**
         * Different Ways of initializing Collection class.
         */
        List list2 = new ArrayList();

        //This is Generic initialization of Interger class. Dev can manually add the value in collection class object.
        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        //Another way of initializing value in Collection class.
        List list3 = Arrays.asList(4,5,6);



    }//end of main()

    /**
     * This Generic method take object of the class and print the object address. We can pass object of class Machine OR class Camera.
     * @param t
     * @param <T>
     */
    public <T> void getObject(T t){
        System.out.println("Object of class -- " + t);
    }

}//End of class

class Machine{
    public String toString(){
        return "This is Object of class Machine";
    }
}

class Camera extends Machine{
    public String toString(){
        return "This is object of calss Camera";
    }
}