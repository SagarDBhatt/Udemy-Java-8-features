package CodeSnippets.Generics;

public class GenericsDemo {

    public static void main(String[] args) {
        //Integer[] intArray = new Integer[5];
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"a","b","c","d"};

        GenericsDemo object = new GenericsDemo();

        //Dev provide Integer type array to call the method "showValue()"
        object.showValues(intArray);
        System.out.println("++++++++++++++++++");

        //Here Dev passed "String" type array to call the same method "ShowValue()"
        object.showValues(strArray);

        // Passing object of class Generic object, class User and Class mentor to call the same method.
        object.showObject(new GenericsDemo());
        object.showObject(new user());
        object.showObject(new mentor());
    }

    /**
     * This method is using Generics <T> to pass the datatype as an argument.
     * <T> : is used to mention that the method is using generics.
     * T[] t : This arguments shows that we need to provide Array datatype at the time of calling this method.
     * @param t
     * @param <T>
     */
    public <T> void showValues( T[] t) {
        for(T input : t){
            System.out.println("Values = "+ input);
        }
    }

    /**
     * This Generic method is used to show object value based on the object passed in argument.
     * @param t
     * @param <T>
     */
    public <T> void showObject (T t){
        System.out.println("Object is = " + t.toString());
    }

}//END OF CLASS

class user{

}

class mentor{

}