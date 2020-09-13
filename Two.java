import java.util.Scanner;

public class Two
{
	public static void main (String [] args)
	{
		
		Scanner cin = new Scanner(System.in);
		
		while(true)
		{
			System.out.print("Enter the number: ");
			int a= cin.nextInt();
			if(a==0) break;
			System.out.print(a + " is ");
			double c=Math.sqrt(a);
			int b=0;
			if(a>0)
			{
				if(a==1) System.out.println("not prime!");
				else if(a==2) System.out.println("prime!");
				else if(a%2==0) System.out.println("not prime!");
				else if(a==3||a==5||a==7) System.out.println("prime!");
				else
				{
					for(int i=3; i<c ;i=i+2)
					{
						if(a%i!=0) 
						{
							b=1;
							break;
						}
					}
					if(b==0) System.out.println("not Prime!");
					else System.out.println("prime!");
				}
			}
			
		}
	}
}
