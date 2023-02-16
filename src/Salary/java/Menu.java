import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private static int getUserNumber() {
        printInformationForUser();
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                int userNumber = s.nextInt();
                if (userNumber < 1 || userNumber > 4) {
                    System.out.println("Invalid input. Please enter correct number.");
                    continue;
                }
                return userNumber;
            } catch (InputMismatchException e) {
                System.out.println("Number which you entered isn't in correct type. Please try again.");
            }
        }
    }

    protected static void chooseOptionFromMenu(ArrayList<Employee> employees) {
        while (true) {
            int userNumber = getUserNumber();
            switch (userNumber) {
                case 1 -> Company.printSalarySum(employees);
                case 2 -> Company.getEmployeeInformation(employees);
                case 3 -> Company.addEmployeeToList(employees);
                case 4 -> System.exit(0);
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
