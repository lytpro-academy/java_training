package codingPrinciples.solid.srp;

/**
 *Single Responsibility Principle (SRP) Example
 * This program demonstrates SRP by separating concerns into distinct classes, each with a single responsibility.
 * Employee class responsible for representing employee data
 * */
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to calculate salary, adhering to SRP by only handling salary-related logic
    public double calculateSalary() {
        // Salary calculation logic
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

