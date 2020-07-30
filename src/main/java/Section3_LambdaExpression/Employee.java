package Section3_LambdaExpression;

public class Employee {
    private int id,salary;
    private String name;
    private Double hoursWorked;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Employee(int id, int salary, String name, Double hoursWorked) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                '}';
    }

    public void getImplementedMethods(getDetails details){
        details.getSalary();
        details.getHoursWorked();
    }
}
