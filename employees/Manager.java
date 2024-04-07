package employees;

public class Manager extends Employee {
    public int numberOfSubordinates; 
    public Manager(String fullName, double Salary) {
        super(fullName, salary); 
        numberOfSubordinates = 0; 
    }
    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
}

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
} 
    public String toString() {
         return "Manager: " + getFullName() + ", Salary: " + getSalary() + ", Subordinates: " + numberOfSubordinates;
}
    
} 
