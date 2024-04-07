import employees.Employee;
import employees.Manager;
import employees.Worker;
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Gal Anonim", 50000);
        employees[1] = new Worker("Mat Szy", 6000);
        employees[2] = new Employee("Mateusz Szymkiewicz", 5500);
        employees[3] = new Worker("Brum Brum", 6500);
        employees[4] = new Worker("Adam Mickiewicz", 7000);

        ((Manager) employees[0]).setNumberOfSubordinates(0);
        
       int nonManagerCount = 0; 
       for (Employee employee : employees) { 
        if (!(employee instanceof Manager)) {
            nonManagerCount++; 
        }  

       } 
       ((Manager) employees[0]).setNumberOfSubordinates(nonManagerCount); 
       ((Manager) employees[0]).setSalary(7500);
        
        System.out.println("\nDane wszysktich pracowników: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}