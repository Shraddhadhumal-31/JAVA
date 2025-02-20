import java.util.*;

public class matrix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
         int i=2;
	 int j=2;
         int ch;

        int[][] a = new int[i][j];
        int[][] b = new int[i][j];
        int[][] c = new int[i][j];
        

	
	
        
	System.out.println("Enter elements of first matrix:");
	{
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}
	
        
	System.out.println("\nEnter elements of second matrix:");
	{
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	}
     
	System.out.println("\n1.Addition\n2.Substraction\n3.Multiplication\n4.Transpose");
	System.out.println("\nEnter Choice:");
	
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:System.out.println("Addition of 2 matrix");
		
		    for(i=0;i<2;i++)
		    {
			    for(j=0;j<2;j++)
			     {
				   c[i][j]=a[i][j]+b[i][j];
			     }
		    }
                     for(i=0;i<2;i++)
		    {
			    for(j=0;j<2;j++)
			     {
				System.out.print(c[i][j]+ " ");
			     }
                             System.out.println();
		    }
		    
			break;
	        case 2:System.out.println("\nSubstraction of 2 matrix");
	    
	           for(i=0;i<2;i++)
		      {
			     for(j=0;j<2;j++)
			    {
			    	c[i][j]=a[i][j]-b[i][j];
			    }
		      }
                   for(i=0;i<2;i++)
		      {
			     for(j=0;j<2;j++)
			    {
			    	System.out.print(c[i][j]+ " ");
			    }
                           System.out.println();
		      }
		    
			  break; 
		      
		 case 3:System.out.println("\nMultiplication of 2 matrix");
			
	
		        for(i=0;i<2;i++)
		      {
			    for(j=0;j<2;j++)
			    {
				 c[i][j]=0;
				for(int k=0;k<2;k++)
				  {
					c[i][j]+=a[i][k]*b[k][j];
				  }
		    	}
		      }
                        for(i=0;i<2;i++)
		      {
			    for(j=0;j<2;j++)
			    {
				 c[i][j]=0;
				for(int k=0;k<2;k++)
				  {
					System.out.print(c[i][j] + " ");
				  }
                                System.out.println();
		    	}
		}
		break;
                
                case 4:System.out.println("\nTranspose of the matrix:");
                       for(i=0;i<2;i++)
	               {
	                 for(j=0;j<2;j++)
	                 {
	    	            c[j][i]=a[i][j];
		         }
	
	               }
	
	
	              for(i=0;i<2;i++)
	              {
		        for(j=0;j<2;j++)
		        {
			System.out.print(c[i][j] +" ");
		        }

			System.out.println();
		      }
                  break;
		
	
	default:System.out.println("Invalid choice");
   
	}
	
	
 }
}





