package CodeSnippets.AnnonymousClass;

public class AnnonymousDemo {

    public static void main(String[] args) {
        //To call a ShowMessage method we need object of AnnonymousDemo class.
        AnnonymousDemo obj1 = new AnnonymousDemo();
        obj1.showMessage();

        
    }

    public void showMessage(){
        System.out.println("Shwoing Message");
    }
}
