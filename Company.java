// Company.java
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Gal Anonim", 50000);
        employees[1] = new Employee("Mat Szy", 60000);
        employees[2] = new Employee("Mateusz Szymkiewicz", 55000);
        employees[3] = new Employee("Brum Brum", 65000);
        employees[4] = new Employee("Adam Mickiewicz", 70000);

        
        System.out.println("Dane pracownika z indeksem 3: ");
        System.out.println(employees[3]);

       
        employees[3].setSalary(90000);

        
        System.out.println("\nDane wszysktich pracowników: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
