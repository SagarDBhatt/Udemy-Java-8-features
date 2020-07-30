package Section3_LambdaExpression.ThreadUsingLambda;

public class RunnerClass {

    public static void main(String[] args) {

        Runnable runnableObj1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 is running!");
            }
        };

        Thread threadObj1 = new Thread(runnableObj1);
        threadObj1.start();

        //====================== USING LAMBDA EXPRESSION!!

         Runnable runobj2 = () -> {
             System.out.println("Thread 2 using Lambda is running.");
         };

         Thread thread2 = new Thread(runobj2);
         thread2.start();

    }
}
