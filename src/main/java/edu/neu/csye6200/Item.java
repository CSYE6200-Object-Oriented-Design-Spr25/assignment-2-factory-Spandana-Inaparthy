package edu.neu.csye6200;

public class Item 

{
	private int ID;
	private String name;
	private double price;
	
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD)
	{
		ID = iD;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getPrice() 
	{
		
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	
	
	//toString
	@Override
	public String toString() {
		return "Item [ID=" + ID +  ", name="  + name  + ", price="  +  price + "]";
	}
	
	
	public String toCSVString() {
		return ID + "," + name + "," + price;
	}
	
	//sorting price,name,id
	public static int CompareByID(Item i1, Item i2)
	{
		return i1.getID()-i2.getID();
	}
	
	public static int CompareByName(Item i1, Item i2) 
	{
		return i1.getName().compareTo(i2.getName());
	}
	
	public static int CompareByPrice(Item i1, Item i2) 
	{
		return Double.compare(i1.getPrice(), i2.getPrice());
	}

}