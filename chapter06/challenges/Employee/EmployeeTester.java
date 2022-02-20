public class EmployeeTester {
    public static void main(String[] args) {

        // create three Employee instances
        Employee employee1 = new Employee("Susan Meyers", "Accounting", "Vice President", 47899);
        Employee employee2 = new Employee("Mark Jones", "IT", "Programmer", 39119);
        Employee employee3 = new Employee("Joy Rogers", "Manufacturing", "Engineer", 81774);


        // invoke the displayInfo...
        displayInfo(employee1);
        displayInfo(employee2);
        displayInfo(employee3);
    }

    /**
     * The displayInfo method display information about an employee.
     * @param employee The employee object create from Employee class.
     */
    public static void displayInfo(Employee employee){
        System.out.printf(
            "\n-----------------------------" +
            "\nName: %s" +
            "\nDepartment: %s" +
            "\nPosition: %s" +
            "\nID Number: %d\n", employee.getName(), employee.getDepartment(),
            employee.getPosition(), employee.getIdNumber()
        );
    }
}
