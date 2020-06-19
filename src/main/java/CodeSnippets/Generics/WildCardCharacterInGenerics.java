package CodeSnippets.Generics;

public class WildCardCharacterInGenerics {

    public static void main(String[] args) {
        WildCardCharacterInGenerics object = new WildCardCharacterInGenerics();
        Machine aMachine = new Machine();
        Camera aCamera = new Camera();

        object.getObject(aMachine);
        object.getObject(aCamera);

    }//end of main()

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