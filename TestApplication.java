import java.util.Scanner;

class Student {
    private int rollNo;
    
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    
    public int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    protected int sub1, sub2;
    
    public void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
    
    public void getMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}


interface Sports {
    int sMarks = 10;
    void set();
}


class Result extends Test implements Sports {
    private int total;
    
    public void set() {
        
        System.out.println("Sports Marks: " + sMarks);
    }
    
    public void display() {
        total = sub1 + sub2 + sMarks;
        System.out.println("Roll No: " + getRollNo());
        getMarks();
        set();
        System.out.println("Total Marks: " + total);
    }
}


public class TestApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result student1 = new Result();
        
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();
        student1.setRollNo(rollNo);
        
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = scanner.nextInt();
        
        student1.setMarks(sub1, sub2);
        student1.display();
        
        scanner.close();
    }
}
