class Employee {
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateAnnualSalary() {
        double tax = basicSalary * 0.10;
        double bonus = basicSalary * 0.02;
        double travellingAllowance = basicSalary * 0.015;

        double monthlySalary = basicSalary - tax + bonus + travellingAllowance;
        return monthlySalary * 12; // Annual salary
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }
}

public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Enter name and basic salary in Command Prompt");
            return;
        }

        String name = args[0];
        double basicSalary = Double.parseDouble(args[1]);

        Employee employee = new Employee(name, basicSalary);
        double annualSalary = employee.calculateAnnualSalary();

        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Basic Salary: " + employee.getBasicSalary());
        System.out.println("Annual Salary (after applying tax, bonus, and travelling allowance): " + annualSalary);
    }
}