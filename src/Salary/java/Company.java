import java.util.ArrayList;
import java.util.List;

public class Company {
    private final List<Employee> employees;

    public Company() {
        this.employees = new ArrayList<>();
    }

    private int getSalarySum() {
        return employees.stream().mapToInt(Employee::salary).sum();
    }

    protected void printSalarySum() {
        System.out.println("Sum of all employees salary equals: " + getSalarySum());
    }

    protected void getEmployeeInformation() {
        employees.stream().map(employee -> "Salary for " + employee.name() + " " + employee.lastName() + " equals " + employee.salary()).forEach(System.out::println);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}