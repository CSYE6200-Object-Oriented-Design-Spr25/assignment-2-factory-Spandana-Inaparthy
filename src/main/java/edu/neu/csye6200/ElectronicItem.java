package edu.neu.csye6200;

import java.util.Scanner;

public class ElectronicItem extends Item 
{
	public ElectronicItem(String csvStringLine) 
	
	{
		
		super();
		Scanner in = new Scanner(csvStringLine);
		in.useDelimiter(",");
		

		int ID=-1;
		try 
		{
			ID = in.nextInt();
		} 
		catch (Exception x1) 
		{
			x1.printStackTrace();
		}
		String name = in.next();
		double price=0.;
		
		try
		{
			price = in.nextDouble();
		} 
		catch (Exception x) 
		{
			x.printStackTrace();
		}
		
		setID(ID);
		setName(name);
		setPrice(price);
		
		in.close();
	}
	
	//  toString
	@Override
	public String toString() {
		return "ElectronicItem [ID=" + getID() + ", Name=" + getName() + ", Price=" + getPrice() + "]";
	}

}

