import java.util.Scanner;

class Student {
    int rollNum;

    void setRollNum(int roll) {
        rollNum = roll;
    }

    void displayRollNum() {
        System.out.println("Roll Number: " + rollNum);
    }
}

class Test extends Student {
    int sub1, sub2;

    void setMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void displayMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

class Result extends Test {
    int total;

    void calculateTotal() {
        total = sub1 + sub2;
    }

    void displayResult() {
        displayRollNum(); 
        displayMarks();   
        System.out.println("Total Marks: " + total);
    }
}

public class Stud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Result student1 = new Result();
        
        System.out.print("Enter Roll Number: ");
        int rollNum = scanner.nextInt();
        student1.setRollNum(rollNum);
        
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = scanner.nextInt();
        
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = scanner.nextInt();
        
        student1.setMarks(sub1, sub2);
        student1.calculateTotal();
        student1.displayResult();
        
        scanner.close();
    }
}
