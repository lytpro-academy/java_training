package codingPrinciples.solid.srp;

/**
 *Main class to demonstrate the Single Responsibility Principle (SRP)
 *
 * •The Employee class is responsible for representing employee data, including name and salary. It encapsulates the data related to an employee's profile.
 * It has a constructor to initialize employee data and a method calculateSalary() to handle salary-related logic, adhering to the SRP. The class is focused on managing employee data and related operations only.
 * •The TaxCalculator class is responsible for calculating tax based on the salary provided.
 * It contains a single method calculateTax() which takes the salary as input and calculates tax based on a fixed tax rate (in this case, 20%). It strictly adheres to SRP (Single Responsibility Principle) by focusing solely on tax calculation logic.
 * •The SRPExample class demonstrates the usage of Employee and TaxCalculator classes.
 * It creates an instance of Employee and TaxCalculator, then calculates the tax for the employee's salary using the calculateTax() method of TaxCalculator. This class demonstrates the separation of concerns and adherence to SRP by keeping different responsibilities in separate classes.
 * */
public class SRPExample {
    public static void main(String[] args) {
        Employee employee = new Employee("John", 50000);
        TaxCalculator taxCalculator = new TaxCalculator();
        double tax = taxCalculator.calculateTax(employee.calculateSalary());
        System.out.println("Tax for " + employee.getName() + ": " + tax);
    }
}
