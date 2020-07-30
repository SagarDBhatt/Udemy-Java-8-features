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


    }
}
