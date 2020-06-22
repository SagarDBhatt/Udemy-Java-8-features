package CodeSnippets.StringOperations;

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

        System.out.printf("%s\n","This is String");


        System.out.printf("%f\n", 2.4);       // 2.400000. Default 6 places decimal points
        System.out.printf("%.2f\n", 2.4);       // 2.40. "%.2f" Set 2 decimal points.

        ////////////////////////////////////////////////////////////////////////////
        /** toString() */

        StringOperations object = new StringOperations();

        System.out.println(object);     //This prints object hashcode. By Default printing object will print object.toString().
                                        // If not defined then by default toString() return Hashcode.

        //Dev can override toString(). Here object.toString() pass the String "Value of the object" as per method definition.
        System.out.println(object.toString());

    }//End of Main()

    /**
     * We can override toString method to return specific object value.
     * @return
     */
    public String toString(){
        return "Value of object";
    }


    public String sayHello(String s){
        return "This is Test method for Hello!!!" + "\n" + "Your Comments ==== " + "\t" + s;
    }

}//End of Class


