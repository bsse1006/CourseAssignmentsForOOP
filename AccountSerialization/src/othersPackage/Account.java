package othersPackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Scanner;

public class Account implements Serializable
{
	private static final long serialVersionUID = 6468712106990670803L;
	
	private  String accName;
	private  String accNumber;
	private  String nid;
	private  double balance;

	
	public Account(String accName, String accNumber, double balance ,String nid)
	{	
		this.accName= accName;
		this.accNumber = accNumber;
		this.balance = balance;
		this.nid = nid;
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
		
	public void checkBalance()
	{
		System.out.println("\nYour account balance is: "+balance+'\n');
	}
		
	public String getAccNum()
	{
		return this.accNumber;
	}
		
	public String getAccName()
	{
		return this.accName;
	}
		

		
		
	public void afterLogIn(Socket client)
	{
		ObjectOutputStream ob = null;
		String s = "\nACCOUNT INFORMATION\nName: " +accName + "\nAccount number: " + accNumber+ "\nNID: "+ nid +
				"\nBalance: "+ balance+'\n';
		try
		{
			ob = new ObjectOutputStream(client.getOutputStream());
			ob.writeObject(s);
			ob.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
