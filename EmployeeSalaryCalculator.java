import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double basicSalary;
    private double bonus;
    private double tax;

    public Employee(String name, int id, double basicSalary, double bonus, double tax) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.tax = tax;
    }

    public double calculateNetSalary() {
        return (basicSalary + bonus - tax);
    }

    public void displayDetails() {
        System.out.println("\nEmployee Salary Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Tax Deducted: " + tax);
        System.out.println("Net Salary: " + calculateNetSalary());
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter Bonus: ");
        double bonus = scanner.nextDouble();
        System.out.print("Enter Tax Deduction: ");
        double tax = scanner.nextDouble();
        Employee emp = new Employee(name, id, basicSalary, bonus, tax);
        emp.displayDetails();
        scanner.close();
    }
}
