

public class StringOperations {


    public static void main(String[] args) {
        /*TEST object = new TEST();
        System.out.println(object.sayHello("First method"));*/

        String str = new String("Hello");
        str.concat("World");    // str is immutable. This will generate a new object with value = "Hello World"

        System.out.println(str);    //Prints "Hello" only as the String object is immutable.

        // Dev can provide reference to new object.
        str = str.concat("World");

        System.out.println(str);    //Prints "Hello World"  as Dev provided the reference to the new string object.

        ////////////////////////////////////////////////////////////////////////////

        StringBuilder sb = new StringBuilder("Hello");  //Objects are mutable.

        sb.append(" World");    //This will append the value in the same object.

        System.out.println(sb);     //

        ////////////////////////////////////////////////////////////////////////////

        int i = 10;

        System.out.printf("%d\n", i);     //%d is used to print digits.

        System.out.printf("%10d\n", i);   //"%10d" : 10 blank spaces in left and them print digit.

        System.out.printf("%-10d\n", i);  //"%10d" : 10 blank spaces in right and them print digit.
    
    }//End of Main()

    public String sayHello(String s){
        return "This is Test method for Hello!!!" + "\n" + "Your Comments ==== " + "\t" + s;
    }

}//End of Class
