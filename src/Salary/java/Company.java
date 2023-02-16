import java.util.ArrayList;

public class Company {

    protected static ArrayList<Employee> getEmployeeList(int numberOfEmployees) {
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < numberOfEmployees; i++) {
            Employee employee = addEmployee();
            employees.add(employee);
            if (i < numberOfEmployees - 1) System.out.println("Next employee");
        }
        return employees;
    }

    private static int getSalarySum(ArrayList<Employee> employees) {
        return employees.stream().mapToInt(Employee::salary).sum();
    }

    protected static void printSalarySum(ArrayList<Employee> employees) {
        System.out.println("Sum of all employees salary equals: " + getSalarySum(employees));
    }

    protected static void getEmployeeInformation(ArrayList<Employee> employees) {
        employees.stream().map(employee -> "Salary for " + employee.name() + " " + employee.lastName() + " equals " + employee.salary()).forEach(System.out::println);
    }

    private static Employee addEmployee() {
        return new Employee(EmployeeDataFromUser.setEmployeeName(),
                EmployeeDataFromUser.setEmployeeLastName(),
                EmployeeDataFromUser.setEmployeeSalary());
    }

    protected static ArrayList<Employee> addEmployeeToList(ArrayList<Employee> employees) {
        Employee newEmployee = addEmployee();
        employees.add(newEmployee);
        return employees;
    }
}