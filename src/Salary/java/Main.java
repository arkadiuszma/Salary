
public class Main {
    private final static int numberOfEmployees = 5;

    public static void main(String[] args) {
        Company company = new Company();
        for (int i = 0; i < numberOfEmployees; i++) {
            company.addEmployee(EmployeeProvider.getEmployeeFromUser());
        }
        Menu.chooseOptionFromMenu(company);
    }
}
