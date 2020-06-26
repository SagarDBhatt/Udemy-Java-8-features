package Section1_CoreJAVA.Polymorphism;

public class Child extends Parent {

    @Override
    public void getName(){
        System.out.println("This is Child");
    }

    public void getBirthday(){
        System.out.println("Child Birthday");
    }
}
