
public class Menu {

    protected static void chooseOptionFromMenu(Company company) {
        while (true) {
            printInformationForUser();
            switch (UserDataHandler.getIntFromUser()) {
                case 1 -> company.printSalarySum();
                case 2 -> company.getEmployeeInformation();
                case 3 -> company.addEmployee(EmployeeProvider.getEmployeeFromUser());
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid input. Please enter correct number.");
            }
        }
    }

    private static void printInformationForUser() {
        System.out.println("""
                Enter correct number from below:
                1 – Print sum of all employees salary
                2 – Display all employees data
                3 – Add new employee
                4 – End program""");
    }
}
