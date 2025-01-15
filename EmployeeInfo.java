public class EmployeeInfo {
    private String ename;
    private String designation;
    private double salary;
    private String email;
    
    // Corrected Constructor (name should match the class name and should not have a return type)
    public EmployeeInfo(String ename, String designation, double salary, String email) {
        this.ename = ename;
        this.designation = designation;
        this.salary = salary;
        this.email = email;
    }
    
    // Getter and Setter methods for ename
    public String getEname() {
        return ename;
    }
    
    public void setEname(String ename) {
        this.ename = ename;
    }
    
    // Getter and Setter methods for designation
    public String getDesignation() {
        return designation;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
    // Getter and Setter methods for salary
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // Getter and Setter methods for email
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println(ename + " works as " + designation + " with emailid " + email + " and earns " + salary + " per annum.");
    }
    
    // Main method to create an EmployeeInfo object and display details
    public static void main(String[] args) {
        EmployeeInfo emp = new EmployeeInfo("Ankan", "Developer", 5000, "ank@ibm.com");
        
        // Display employee details
        emp.displayEmployeeDetails();
    }
}
