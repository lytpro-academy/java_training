package objects.equalsAndHashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Rony", 24);
        Employee employee1 = new Employee("Harry", 25);
        Employee employee2 = new Employee("Rony", 24);

        Set<Employee> employees = new HashSet<>();
        employees.add(employee);

        var isEqual = employees.contains(employee2);
        System.out.println(isEqual);

        System.out.println("employee.hashCode():  " + employee.hashCode()
                + "  employee2.hashCode():" + employee2.hashCode());
    }
}
