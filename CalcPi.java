// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) 
	{
		int num = Integer.parseInt(args[0]);
		double sum=0;
		for(int i=0;i<num;i++)
		{
			sum=sum+((Math.pow((-1), i)) / (2*i+1));
		}
		double p=sum*4;
		double truep=Math.PI;
		System.out.println("pi according to Java: "+truep);
		System.out.println("pi, approximated:     "+p);





	    
	}
}
