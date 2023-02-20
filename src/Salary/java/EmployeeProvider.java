public class EmployeeProvider {
    public static Employee getEmployeeFromUser() {
        return new Employee(getEmployeeName(),
                getEmployeeLastName(),
                getEmployeeSalary());
    }

    protected static String getEmployeeName() {
        System.out.println("Enter employee name: ");
        return UserDataHandler.getTextFromUser();
    }

    protected static String getEmployeeLastName() {
        System.out.println("Enter employee last name: ");
        return UserDataHandler.getTextFromUser();
    }

    protected static int getEmployeeSalary() {
        System.out.println("Enter employee salary: ");
        return UserDataHandler.getIntFromUser();
    }
}
