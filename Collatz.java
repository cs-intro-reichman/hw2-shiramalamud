// Demonstrates the Collatz conjecture.
public class Collatz 
{
	public static void main(String args[]) 
	{
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int count=1;
		int num=0;
		if (mode.equals("v"))
		{
			if(seed==1)
		    {
			    System.out.println("1 4 2 1 "+"(4)");
				System.out.println();
				System.out.println("Every one of the first 1 hailstone sequences reached 1.");
		    }
		    else
		    {
                 System.out.print("1 4 2 1 "+"(4)");
			     for(int i=2;i<=seed;i++)
		         {
			          System.out.println();
			          num=i;
			          System.out.print(num+" ");
			          while(num!=1)
		              {
			               if(num%2==0)
			                 {
				                   num=num/2;
			                 }
			                else
			                 {
				                   num=(num*3)+1;
			                 }
			                 count++;
				             System.out.print(num+" ");
	    	           }
			           System.out.print("("+count+")");
					   count=1;
		     	}
				System.out.println();
				System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
				

		   }
		}
		if (mode.equals("c"))
		{
			if(seed==1)
		    {
			    System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
		    }
		    else
		    {
			     for(int i=2;i<=seed;i++)
		         {
			          num=i;
			          while(num!=1)
		              {
			              if(num%2==0)
			              {
				               num=num/2;
			              }
			              else
			              {
				               num=(num*3)+1;
			              }
			              count++;
					  }
				       count=1;
			     }
				 System.out.println("Every one of the first "+seed+" hailstone sequences reached 1.");
	    	}
		}
	}
}
