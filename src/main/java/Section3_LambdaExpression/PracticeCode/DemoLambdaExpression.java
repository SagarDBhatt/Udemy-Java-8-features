package Section3_LambdaExpression.PracticeCode;

public class DemoLambdaExpression {

    public static void main(String[] args) {

        // WITHOUT LAMBDA EXP
        functionalInterfce interfceObject = new functionalInterfce() {
            @Override
            public void draw() {
                System.out.println("Draw method without using lambda expression.");
            }
        };
        interfceObject.draw();      //calling draw()

        functionalInterfce interfceObject2 = () -> {
            System.out.println("Draw method implementation using Lambda Expression!");
        };
        interfceObject2.draw();     //calling draw()

        //=============================================================================

        oneArgumentFunctInterface argObject = (x) -> {
            System.out.println("Value to print == " + x);
        };
        argObject.printNumber(10);

        //--------------
        //--------------

        multiArgsFuncInterface mulObject = (a,b) -> {
            System.out.println("This is multi-line, multi-args and return type lambda expression");
            return a*b;
        };

        System.out.println(mulObject.multiply(12,5));
    }
}
