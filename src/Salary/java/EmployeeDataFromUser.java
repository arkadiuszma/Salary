import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class EmployeeInputFromUser{

    protected static String setEmployeeName() {
        System.out.println("Enter employee name: ");
        return textValidation();
    }
    protected static String setEmployeeLastName() {
        System.out.println("Enter employee last name: ");
        return textValidation();
    }
    protected static int setEmployeeSalary(){
        System.out.println("Enter employee salary: ");
        return numberValidation();
    }

    private static int numberValidation() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                int salary = s.nextInt();
                if (salary>0) {
                    return salary;
                } else {
                    System.out.println("Invalid input. Please enter correct number format.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect number type. Please try again.");
            }
        }
    }

    private static String textValidation() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                if (s.hasNext("[A-Za-z]*")) {
                    return s.nextLine();
                } else {
                    System.out.println("Invalid input. Please enter correct text format.");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Text value is required. Please try again.");
            }
        }
    }
}
