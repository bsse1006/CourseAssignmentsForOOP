package banking;
import java.util.Scanner;

public class Account
{
	
	//private  String accName;
	private  String accNumber;
	//private  String nid;
	private  double balance;

	private Person p;
	
	public Account(String accName, String accNumber, double balance ,String nid)
	{	
		this.accNumber = accNumber;
		this.balance = balance;
		
		p=new Person(accName,nid);
	}
	
	
	
	public void withdraw()
	{
		Scanner cin = new Scanner (System.in);
	
		System.out.print("\nEnter withdrawal ammount: ");
	
		double ammount = cin.nextDouble();
		System.out.println();
		
		if(ammount <= balance-500.00 && ammount>=100.00)
		{
			balance =balance- ammount;
			System.out.println("WITHDRAWAL DONE!\n");
			
		}	
		else System.out.println("WITHDRAWAL AMMOUNT IS INVALID!\n");
		
		System.out.println("Your current balance is: "+balance+'\n');
	}		 
	
	public void deposit()
	{
		Scanner cin = new Scanner (System.in);

		System.out.print("\nEnter deposit ammount: ");
		
		double ammount = cin.nextDouble();
		System.out.println();
		
		if(ammount>=500.00)
		{
			balance =balance+ammount;
			System.out.println("DEPOSIT DONE!\n");
		}
		else System.out.println("DEPOSIT AMMOUNT IS INVALID!\n");
		
		System.out.println("Your current balance is: "+balance+'\n');
	}
		
	public double getBalance()
	{
		return this.balance;
	}
		
	public String getAccNum()
	{
		return this.accNumber;
	}
		
	public String getAccName()
	{
		return p.getName();
	}
		
	public void printAllInfo()
	{
		System.out.println("\nACCOUNT INFORMATION\n" + p + "Account number: "
				+ accNumber +
			"\nBalance: "+ balance+'\n');
		
	}

	

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}



	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Person getP() {
		return p;
	}

	public String getAccNumber() {
		return accNumber;
	}
}