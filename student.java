import java.util.*;
class student
{
static String name;
static int rollno;
static String course;

static
{
System.out.println("Information");
}

static void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student name:");
name=sc.next();

System.out.println("Enter roll no:");
rollno=sc.nextInt();

System.out.println("Enter Course Name:");
course=sc.next();
}

static void display()
{

System.out.println("Student Details:");
System.out.println("Name:"+name);
System.out.println("Roll No:"+rollno);
System.out.println("Course:"+course);
}

public static void main(String args[])
{
input();
display();
}
}


