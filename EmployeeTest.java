
class Employee {
    
    private String firstName;
    private String lastName;
    private double monthlySalary;

   
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary); 
    }

   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        
        if (monthlySalary > 0)
        {
            this.monthlySalary = monthlySalary;
        }
        else
        {
            this.monthlySalary = 0.0;
        }
    }

    
    public double getYearlySalary() 
    {
        return monthlySalary * 12;
    }

   
    public void giveRaise() 
    {
        this.monthlySalary *= 1.10;
    }
}



public class EmployeeTest {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("John", "Doe", 5000);
        Employee emp2 = new Employee("Jane", "Smith", 6000);

        
        System.out.println("Employee 1: " + emp1.getFirstName() + " " + emp1.getLastName());
        System.out.println("Yearly Salary: $" + emp1.getYearlySalary());

        System.out.println("\nEmployee 2: " + emp2.getFirstName() + " " + emp2.getLastName());
        System.out.println("Yearly Salary: $" + emp2.getYearlySalary());

       
        emp1.giveRaise();
        emp2.giveRaise();

        // Display yearly salary after raise
        System.out.println("\nAfter 10% Raise:");
        System.out.println("Employee 1 Yearly Salary: $" + emp1.getYearlySalary());
        System.out.println("Employee 2 Yearly Salary: $" + emp2.getYearlySalary());
    }
}
