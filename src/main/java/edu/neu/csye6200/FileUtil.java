package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtil 
{
	public static void write(String fileName, List<String> content) 
	{
		
		try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName)))
		{	
			for (String line : content) 
			{
				out.write(line);
				out.newLine();
			}
			out.flush();
		} 
		catch (IOException x) 
		{
			x.printStackTrace();
		}
	}
	
	public static List<String> read(String fileName) 
	{
		String thisLine = null;
		List<String> list = new ArrayList<>();
		try (BufferedReader in = new BufferedReader(new FileReader(fileName)))
		{	
			while ((thisLine = in.readLine()) != null) 
			{
				list.add(thisLine);
			}
		} 
		
		catch (IOException x)
		{
			x.printStackTrace();
		}
		
		return list;
	}

}
