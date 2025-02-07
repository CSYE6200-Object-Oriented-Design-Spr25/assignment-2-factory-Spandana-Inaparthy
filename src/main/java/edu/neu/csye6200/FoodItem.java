package edu.neu.csye6200;

import java.util.Scanner;

public class FoodItem extends Item 
{
	public FoodItem(String csvStringLine) 
	{
		super();
		Scanner in = new Scanner(csvStringLine);
		in.useDelimiter(",");
		
		int ID=-1;
		try 
		{
			ID = in.nextInt();
		}
		catch (Exception x) {
			x.printStackTrace();
		}
		String name = in.next();
		double price=0.;
		try 
		{
			price = in.nextDouble();
		}
		catch(Exception x2) 
		{
			x2.printStackTrace();
		}
		
		setID(ID);
		setName(name);
		setPrice(price);
		
		in.close();
	}

	@Override
	public String toString() {
		return "FoodItem [ID()=" + getID() + ", Name()=" + getName() + ", Price()=" + getPrice() + "]";
	}

}