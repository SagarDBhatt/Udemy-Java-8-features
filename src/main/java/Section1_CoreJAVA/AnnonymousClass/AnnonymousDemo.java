package Section1_CoreJAVA.AnnonymousClass;

public class AnnonymousDemo {

    public static void main(String[] args) {
        //To call a ShowMessage method we need object of AnnonymousDemo class.
        AnnonymousDemo obj1 = new AnnonymousDemo();
        obj1.showMessage();

        // Now, create an annonymous class and override method message(). Object of an annonymous class access the overriden "message()" method.
        Test obj = new Test(){
            @Override
            public void message(){
                System.out.println("Inside inner annonymous class");
            }
        };
        obj.message();
    }

    public void showMessage(){
        System.out.println("Shwoing Message");
    }
}
