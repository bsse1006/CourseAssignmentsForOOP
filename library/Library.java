
import java.util.Scanner;

public class Library 
{
	Book b [] = new Book[20];
	
	private int bookq =5;
	private int authorq =3;
	
	Author a []= new Author[20];
	
	public void store()
	{
		Scanner cin = new Scanner (System.in);
		System.out.println("Enter name: ");
		String s= cin.nextLine();
		System.out.println("Enter price: ");
		double d= cin.nextDouble();
		System.out.println("Enter qty: ");
		int p= cin.nextInt();
		
		System.out.println("Select author: \n");
		
		for(int i=1;i<=authorq;i++)
		{
			System.out.println(i);
			System.out.println(a[i-1]);
		}
		System.out.println("Or enter 0 to add author!");
		int q = cin.nextInt();
		
		if(q==0)
		{
			System.out.println("Enter name: ");
			String s1= cin.nextLine();
			s1= cin.nextLine();
			System.out.println("Enter email: ");
			String e= cin.nextLine();
			System.out.println("Enter gender: ");
			char c= cin.next().charAt(0);
			
			a[authorq] = new Author (s1,e,c);
			
			b[bookq]=new Book (s,a[authorq],d,p);
			authorq++;
			bookq++;
		}
		else
		{
			b[bookq]=new Book (s,a[q-1],d,p);
		
			bookq++;
		}
	}
	
	public int search()
	{
		Scanner cin = new Scanner (System.in);
		
		System.out.println("Enter book name: ");
		
		String s2= cin.nextLine();
		
		int i=0;
		for(;i<bookq;i++)
		{
			if(b[i].getName().equals(s2))
			{
				System.out.println("\nBook is found!\n");
				System.out.println(b[i]);
				break;
			}
		}
		
		if(i>=bookq) 
		{
			System.out.println("\nBook is not found!\n");
			return -1;
		}
		return i;
	}
	
	public void borrow()
	{
		int u = search();
		
		b[u].setQty(b[u].getQty()-1);
		
		System.out.println("Successfully borrowed!");
		System.out.println("Now qty is " + b[u].getQty());
	}
	
	public void operation() 
	{
		Scanner cin = new Scanner (System.in);
		a[0] = new Author ("Yasin","gmail",'m');
		a[1] = new Author ("Jahid","Yahoo",'m');
		a[2] = new Author ("Lamisa","gmail",'f');
		
		b[0] = new Book ("gaan",a[0],150,5);
		b[1] = new Book ("golpo",a[1],250,7);
		b[2] = new Book ("rommo",a[2],350,20);
		b[3] = new Book ("kabbo",a[1],400,12);
		b[4] = new Book ("natok",a[2],275,15);
		
		for(int i=0;i< bookq;i++)
		{
			System.out.println(b[i]);
			
		}
		
		while(true)
		{
			System.out.println("1.Store book\n2.Search a book\n3.Borrow a book\n4.Exit\n");
			int a=cin.nextInt();
			if(a==1) store();
			else if(a==2) search();
			else if (a==3) borrow();
			else break;
		}
	}
}
