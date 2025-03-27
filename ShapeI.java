interface Shape{
  
    abstract int area();

}

class Rectangle implements Shape 
{
 public void area()
  { 
  Scanner sc=new Scanner(System.in);
  int l,b;
  l=sc.nextInt();
  b=sc.nextInt();

   System.out.println("Enter Length and breadth of rectangle:");
   int area=l*b;


    }
}

class Triangle implements Shape 
{ 
Scanner sc=new Scanner(System.in);
 
public void area()
{
int ba,h;

  ba=sc.nextInt();
  h=sc.nextInt();

   
        System.out.println("Enter base and height:");
        int area= 0.5 * ba * h; 
    }
}

public class ShapeI
{
	
    public static void main(String[] args) 
	{
       Shape s=new Rectangle();
       Shape s1=new Triangle();

       s.area();
       s1.area();
        
    }
}