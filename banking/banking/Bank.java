package banking;
import java.util.Scanner;

public class Bank
{
	Account acc [];	
	
	public void initialize ()
	{
		acc = new Account[5];
		
		acc[0]=new Account("Yasin","1006",6000,"12");
		acc[1]=new Account("Jahid","1030",30000,"24");
		acc[2]=new Account("Sakib","1005",5000,"56");
		acc[3]=new Account("Akram","1007",7000,"78");
		acc[4]=new Account("Rimon","1008",8000,"10");
	}
	
	
	
	public void menuChooser(int i)
	{	
		Scanner cin = new Scanner (System.in);
		
		System.out.print("\nWelcome "+acc[i].getAccName()+"!");
			
		while(true)
		{
			
			System.out.println("\n1.Check balance\n2.Withdraw money\n3.Deposit money\n4.Print account info\n5.Log out\n");
			
			int choice;
			choice = cin.nextInt();
				
			if(choice==5) break;
			else if(choice==1) System.out.println("\nYour account balance is: "+acc[i].getBalance()+'\n');
			else if(choice==2) acc[i].withdraw();
			else if(choice==3) acc[i].deposit();
			else if(choice==4) acc[i].printAllInfo();
		}
	}
	
	public void accountSearch ()
	{
		Scanner cin = new Scanner (System.in);
		
		System.out.print("\nEnter account number: ");
				
		String s3=cin.nextLine();
		int j=-1;
			
		for(int i=0;i<5;i++)
		{	
			String s4 = acc[i].getAccNum();
			if(s4.equals(s3))
			{	
				j=i;
			}
		}
		
		if(j!=-1) menuChooser(j);
		else System.out.println("\nACCOUNT NOT FOUND!\n");
	}
	
	public void operation ()
	{		
		Scanner cin = new Scanner (System.in);
		
		initialize();
		
		System.out.println("Yasin's NID: " +acc[0].getP().getNid());
		
		while(true)
		{
			System.out.println("\nWELCOME TO THE BANK!\n1.Log in\n2.Exit\n");
			
			int choice;
			choice = cin.nextInt();
			
			if(choice==2) break;
			else if(choice==1) accountSearch();
		}
		
		
	}
}

