class StaticDemo 
{
    
    static int count = 0;

    
     static 
    {
        System.out.println("Static block executed! Initializing static resources...");
        count = 100;  
    }

   
    StaticDemo() 
    {
        count++;
        System.out.println("Constructor called. Updated count: " + count);
    }

    
    static void displayCount()
    {
        System.out.println("Static method called! Count: " + count);
    }

    public static void main(String[] args) 
    {
        System.out.println("Main method started!");

        
        StaticDemo.displayCount();

        
        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        
        StaticDemo.displayCount();
    }
}
