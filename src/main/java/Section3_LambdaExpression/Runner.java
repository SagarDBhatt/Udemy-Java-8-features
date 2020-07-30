package Section3_LambdaExpression;

public class Runner {

    public static void main(String[] args) {
        Employee emp = new Employee(1,1000,"Robert",8.5);

        //Implementation without Lambda Expression.
        emp.getImplementedMethods(new getDetails() {
            @Override
            public void getSalary() {
                System.out.println("Salary = " + emp.getSalary());
            }

            @Override
            public void getHoursWorked() {
                System.out.println("Hours worked = " + emp.getHoursWorked());
            }
        });
    }

}
