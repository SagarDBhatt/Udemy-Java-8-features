package Section1_CoreJAVA.Polymorphism;

public class Parent {

    static {
        System.out.println("This is static block. This block executes before 'main' method executes.");
    }


    public void getName() {
        System.out.println("This is Parent");
    }

    public static void main(String[] args) {

        Parent aParent = new Parent();
        Child aChild = new Child();

        aParent.getName();      //This is Parent
        aChild.getName();       //This is Child

        Parent aParent2 = new Child();
        aParent2.getName();     //This is Child

//        aParent2.getBirthday(); //Error : Object that refer to Child class can not access Child class methods.


    }
}
