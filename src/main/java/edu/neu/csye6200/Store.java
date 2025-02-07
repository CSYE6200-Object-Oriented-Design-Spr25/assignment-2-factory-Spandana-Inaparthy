package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store  extends AbstractStore 
{
	public void demo() 
	
	{
		//CSV String for food items
		String[] foodCSVString = {
				"5,Organic Bagged Avocado,4.99",
				"6,Organic Yellow Potato,1.99",
				"7,Organic White Mushrooms,3.49"
		};
		String foodFileName="./FoodItemCSV.txt";

		FileUtil.write(foodFileName, Arrays.asList(foodCSVString));
		
		//CSV String for service 
		String[] serviceCSVString = {
				"8,Water and Sewer,120",
				"9,Electricity,110",
				"10,WiFi,81.99"
		};
		String serviceFileName="./ServiceItemCSV.txt";
		
		FileUtil.write(serviceFileName, Arrays.asList(serviceCSVString));
		
		
		//CSV String for electronic items
		String[] electronicCSVString = {
				"1,iPhone 16 Pro,1099.00",
				"2,Apple Watch Hermès Ultra 2,1399.00"
		};
		
		String electronicFileName="./ElectronicItemCSV.txt";
		
		FileUtil.write(electronicFileName, Arrays.asList(electronicCSVString));
		
		
		
		// List of items 
		List<Item> items = new ArrayList<>();
		
		ServiceItemFactory serviceItemFactory = ServiceItemFactory.getInstance();
		List<String> serviceItemsCSVString = FileUtil.read(serviceFileName);
		serviceItemsCSVString.forEach(v -> {
			Item serviceItem = serviceItemFactory.getObject(v);
			items.add(serviceItem);
		});
		
                FoodItemFactory foodItemFactory = new FoodItemFactory();
		List<String> foodItemsCSVString = FileUtil.read(foodFileName);
		foodItemsCSVString.forEach(v -> {
			Item foodItem = foodItemFactory.getObject(v);
			items.add(foodItem);
		});
		
		
		ElectronicItemFactory electronicItemFactory = ElectronicItemFactory.getInstance();
		List<String> electronicItemsCSVString = FileUtil.read(electronicFileName);
		electronicItemsCSVString.forEach(v -> {
			Item electronicItem = electronicItemFactory.getObject(v);
			items.add(electronicItem);
		});
		
		// before sorting
		System.out.println("BEFORE SORTING:");
		items.forEach(System.out::println);
		System.out.println("---------------------------------xxx-------------------------------------");
		System.out.println("");
		 
		
		// sorting name
		System.out.println("SORTING BY NAME:");
		items.sort(Item::CompareByName);
		items.forEach(System.out::println);
		System.out.println("---------------------------------xxx-------------------------------------");	
                System.out.println("");
                
                // sorting ID
		System.out.println("SORTING BY ID:");
		items.sort(Item::CompareByID);
		items.forEach(System.out::println);
		System.out.println("---------------------------------xxx-------------------------------------");
                System.out.println("");
		
		
		// sorting price
		System.out.println("SORTING BY PRICE:");
		items.sort(Item::CompareByPrice);
		items.forEach(System.out::println);
		
	}
}