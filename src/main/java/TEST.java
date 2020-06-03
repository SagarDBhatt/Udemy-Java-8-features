

public class TEST {


    public static void main(String[] args) {
        TEST object = new TEST();
        System.out.println(object.sayHello("First method"));
    }

    public String sayHello(String s){
        return "This is Test method for Hello!!!" + "\n" + "Your Comments ==== " + "\t" + s;
    }
}
