import java.util.Scanner;

abstract class Shape 
{
    double dim1, dim2;

    void setDimensions(double d1, double d2) 
    {
        dim1 = d1;
        dim2 = d2;
    }

    abstract double area();
}

class Rectangle extends Shape 
{
    double area() 
    {
        return dim1 * dim2;
    }
}

class Triangle extends Shape 
{
    double area() 
    {
        return 0.5 * dim1 * dim2; 
    }
}

public class ShapeMain 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter dimensions for Rectangle (length and width): ");
        double rectDim1 = scanner.nextDouble();
        double rectDim2 = scanner.nextDouble();
        
        Rectangle rect = new Rectangle();
        rect.setDimensions(rectDim1, rectDim2);
        System.out.println("Area of Rectangle: " + rect.area());
        
        System.out.print("Enter dimensions for Triangle (base and height): ");
        double triDim1 = scanner.nextDouble();
        double triDim2 = scanner.nextDouble();
        
        Triangle tri = new Triangle();
        tri.setDimensions(triDim1, triDim2);
        System.out.println("Area of Triangle: " + tri.area());
        
        scanner.close();
    }
}
