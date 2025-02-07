package edu.neu.csye6200;

public class FoodItemFactory 
{
public FoodItemFactory() {}
	
	public FoodItem getObject(String CSVString)
	{
		return new FoodItem(CSVString);
	}

}