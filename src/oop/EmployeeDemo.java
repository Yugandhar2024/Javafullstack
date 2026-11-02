package oop;

/**
 * EmployeeDemo - demonstrates basic employee object modeling.
 */
public class EmployeeDemo {
    private String name;
    private int employeeId;

    public EmployeeDemo(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void printEmployee() {
        System.out.println("Employee: " + name + " | ID: " + employeeId);
    }

    public static void main(String[] args) {
        EmployeeDemo emp = new EmployeeDemo("Kiran", 1001);
        emp.printEmployee();
    }
}
