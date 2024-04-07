package employees;

public class Employee {
    private String fullName; 
    protected static double salary; 

   public Employee(String fullName, double salary) {
    this.fullName = fullName; 
    Employee.salary = salary;
   }

public String getName() { 
    return fullName;
   } 
   public double getSalary() {
    return salary;
   } 
   public void setSalary(double newSalary) {
    Employee.salary = newSalary;
   } 
   public String toString() { 
    return "Employee: " + fullName + ", Salary: " + salary; 

   }  
   protected String getFullName() {
    return fullName;
 }

}
