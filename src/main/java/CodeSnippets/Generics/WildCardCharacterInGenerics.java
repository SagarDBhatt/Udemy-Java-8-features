package CodeSnippets.Generics;

public class WildCardCharacterInGenerics {

    public static void main(String[] args) {
        WildCardCharacterInGenerics object = new WildCardCharacterInGenerics();
        Machine aMachine = new Machine();
        Camera aCamera = new Camera();

        object.getObject(aMachine);
        object.getObject(aCamera);

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