package Section3_LambdaExpression.ComparatorUsingLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerComparator {

    public static void main(String[] args) {
        Employee emp = new Employee(1,1000,"Robert",8.5);

        //Implementation without Lambda Expression.
        emp.getImplementedMethods(new getDetails() {
            @Override
            public void getSalary() {
                System.out.println("Salary = " + emp.getSalary());
            }
        });

        //USING LAMBDA EXP!
        emp.getImplementedMethods(() -> {
            System.out.println("Salary of employee = " + emp.getName() + " is = $" + emp.getSalary());
        });

        //============ USE COMPARATOR INTERFACE TO SORT OBJECTS BASED ON FIELD.
        Employee emp2 = new Employee(2,5000,"Patrick",10.5);
        Employee emp3 = new Employee(3,8000,"Dan",11.5);
        Employee emp4 = new Employee(4,4800,"Elizabeth",8.0);

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(emp);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);

        //CAN NOT USE COLLECTION.SORT FOR EMPLOYEE LIST - NEED TO SPECIFY SORTING BASED ON WHICH FIELD.
        //Collections.sort(employeeList);

        //SORTING BASED ON 'NAME' COMPARATOR INTERFACE WITHOUT LAMBDA EXP : REQUIRES IMPLEMENTATION OF
        // COMPARATOR INTERFACE.
       System.out.println("Sorting based on employee name");
       Collections.sort(employeeList, new Comparator<Employee>() {
           @Override
           public int compare(Employee o1, Employee o2) {
               return o1.getName().compareTo(o2.getName());
           }
       });

       for(Employee obj : employeeList){
           System.out.println(obj.toString());
       }

       System.out.println("Sort Employee List based on Employee Workhours\n");
       Collections.sort(employeeList, new Comparator<Employee>() {
           @Override
           public int compare(Employee o1, Employee o2) {
               return -o1.getHoursWorked().compareTo(o2.getHoursWorked());  //PUTTING '-' MINUS SIGN SORT IN DESCENDING ORDER.
           }
       });

       for(Employee empl : employeeList){
           System.out.println(empl);
       }

       //LAMBDA EXPRESSION TO SORT BASED ON SALARY.
       Collections.sort(employeeList, (e1, e2) -> {
          if(e1.getSalary() >= e2.getSalary())
              return 1;
          else
              return -1;
       });
        for(Employee e: employeeList)
            System.out.println("With lambda exp = "+e);
    }

}
