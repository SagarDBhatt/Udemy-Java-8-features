package CodeSnippets.Polymorphism;

public class Parent {

    public void getName(){
        System.out.println("This is Parent");
    }

    public static void main(String[] args) {

        Parent aParent = new Parent();
        Child aChild = new Child();

        aParent.getName();      //This is Parent
        aChild.getName();       //This is Child

        Parent aParent2 = new Child();
        aParent2.getName();     //This is Child


    }
}
