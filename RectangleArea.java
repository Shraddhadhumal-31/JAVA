

import java.util.Scanner;

class Area 
{
 private int length;
 private int breadth;

    
 public void setDim(int length, int breadth)
 {
  this.length = length;
  this.breadth = breadth;
 }

    
 public int getArea() 
 {
   return length * breadth;
 }
}

public class RectangleArea 
{
 public static void main(String[] args) 
 {
 Scanner sc = new Scanner(System.in);
        
        
 System.out.print("Enter the length of the rectangle: ");
 int length = sc.nextInt();
        
 System.out.print("Enter the breadth of the rectangle: ");
 int breadth = sc.nextInt();
        
 Area a = new Area();
 a.setDim(length, breadth);
        
        
System.out.println("The area of the rectangle is: " +a.getArea());
        sc.close();
    }
}
