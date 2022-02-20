public class Employee{

    // fields
    private String name;
    private String department;
    private String position;
    private int idNumber;

    /**
     * No-Arg Constructor
     */
    public Employee() {
        this.name = "";
        this.department = "";
        this.position = "";
        this.idNumber = 0;
    }

    /**
     * Constructor
     * @param name
     * @param department
     * @param position
     * @param idNumber
     */
    public Employee(String name, String department, String position, int idNumber) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.idNumber = idNumber;
    }

    /**
     * Constructor
     * @param name
     * @param idNumber
     */
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    
}
