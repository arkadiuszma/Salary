import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserDataHandler {

    public static int getIntFromUser() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                int salary = s.nextInt();
                if (salary > 0) {
                    return salary;
                } else {
                    System.out.println("Invalid input. Please enter correct number format.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect number type. Please try again.");
            }
        }
    }

    public static String getTextFromUser() {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                if (s.hasNext("[A-Za-ząćęłńóśźżĄĘŁŃÓŚŹŻ]*")) {
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
