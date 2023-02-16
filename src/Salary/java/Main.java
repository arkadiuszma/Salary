import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int numberOfEmployees = 5;
        ArrayList<Employee> employees = Company.getEmployeeList(numberOfEmployees);
        Menu.chooseOptionFromMenu(employees);
    }
}
