package oop;

/**
 * SalaryCalculation - demonstrates employee salary calculation.
 */
public class SalaryCalculation {
    public static double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }

    public static void main(String[] args) {
        double salary = calculateSalary(45000, 5000);
        System.out.println("Total Salary: " + salary);
    }
}
