// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args)
        {
                String name = args[0];
                String newname="";
                int i=0;
                while(i<name.length())
                {
                        newname=newname+Character.toUpperCase(name.charAt(i));
                        i++;
                }
                int num = Integer.parseInt(args[1]);
                String letters="AEFHILMNORSX";
                for(int j=0; j<newname.length(); j++)
                {
                        char ch=newname.charAt(j);
                        if (letters.indexOf(ch)!=-1)
                        {
                                System.out.println("Give me an "+": "+ch+": "+ch+"!");
                        }
                        else
                        {
                                System.out.println("Give me a  "+": "+ch+": "+ch+"!");
                        }
                }
                System.out.println("What does that spell?");
                for (int j=0; j<num; j++)
                {
                        System.out.println(newname+"!!!");
        
                }


	    
        }
}
