package banking;
import java.util.Scanner;

public class Person
{
	private String name, address, nid, phone;
	private int age;
	
	public Person (String name, String address, String nid, String phone, int age)
	{
		this.name=name;
		this.address=address;
		this.nid=nid;
		this.phone=phone;
		this.age=age;
	}
	
	public String getName() 
	{
		return name;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public String getNid() 
	{
		return nid;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public Person (String name, String nid)
	{
		this.name=name;
		this.nid=nid;
	}
	
	public Person ()
	{
	
	}
	
	public String toString ()
	{
		return "Name: " + name + "\nNID: " + nid + '\n'; 
	}
	
}