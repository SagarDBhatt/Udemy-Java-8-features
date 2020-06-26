package Section1_CoreJAVA.Abstract;

public class Child extends AbstractDemo {

    public static void main(String[] args) {
        Child object = new Child();
        object.showMessage();
    }

    @Override
    public void showMessage() {
        System.out.println("This is Child class,");
    }

    @Override
    protected void showAge() {
        System.out.println("Age in child class");
    }
}
