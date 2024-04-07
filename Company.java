import employees.Employee;
import employees.Manager;
import employees.Worker;
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Gal Anonim", 50000);
        employees[1] = new Worker("Mat Szy", 60000);
        employees[2] = new Employee("Mateusz Szymkiewicz", 55000);
        employees[3] = new Worker("Brum Brum", 65000);
        employees[4] = new Worker("Adam Mickiewicz", 70000);
        
        ((Manager) employees[0]).setNumberOfSubordinates(0);
        
       
        
        System.out.println("\nDane wszysktich pracowników: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
