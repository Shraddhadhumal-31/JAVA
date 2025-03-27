
abstract class Employee {
    protected String name;
    protected String address;
    protected double salary;
    protected String jobTitle;


    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    
    public abstract double calculateBonus();

    public void generatePerformanceReport() {
        System.out.println("Performance Report for " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + calculateBonus());
    }

    
    public void displayDetails() {
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Title: " + jobTitle);
    }
}


class Manager extends Employee {
    private int numOfProjects;

    public Manager(String name, String address, double salary, int numOfProjects) {
        super(name, address, salary, "Manager");
        this.numOfProjects = numOfProjects;
    }

   
    @Override
    public double calculateBonus() {
        return (0.15 * salary) + (numOfProjects * 500);
    }

    
    public void manageProject() {
        System.out.println(name + " is managing " + numOfProjects + " projects.");
    }
}

class Developer extends Employee {
    private int completedProjects;

    public Developer(String name, String address, double salary, int completedProjects) {
        super(name, address, salary, "Developer");
        this.completedProjects = completedProjects;
    }

    
    @Override
    public double calculateBonus() {
        return (0.10 * salary) + (completedProjects * 300);
    }

   
    public void developSoftware() {
        System.out.println(name + " has completed " + completedProjects + " projects.");
    }
}


class Programmer extends Employee {
    private int linesOfCodeWritten;

    public Programmer(String name, String address, double salary, int linesOfCodeWritten) {
        super(name, address, salary, "Programmer");
        this.linesOfCodeWritten = linesOfCodeWritten;
    }

    @Override
    public double calculateBonus() {
        return (0.08 * salary) + (linesOfCodeWritten * 0.05);
    }

    
    public void writeCode() {
        System.out.println(name + " has written " + linesOfCodeWritten + " lines of code.");
    }
}
public class employee {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Johnson", "New York, USA", 90000, 5);
        Developer developer = new Developer("Bob Smith", "San Francisco, USA", 80000, 10);
        Programmer programmer = new Programmer("Charlie Brown", "Los Angeles, USA", 60000, 50000);

        // Display details and performance reports
        manager.displayDetails();
        manager.generatePerformanceReport();
        manager.manageProject();

        developer.displayDetails();
        developer.generatePerformanceReport();
        developer.developSoftware();

        programmer.displayDetails();
        programmer.generatePerformanceReport();
        programmer.writeCode();
    }
}
