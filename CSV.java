package bank;
import java.io.*;

import java.util.*;
public class CSV {
	
	// This function will read data from a CSV file  return as a list.
	
	public static List<String[]> read(String file)
	{
		List<String[] >data =new LinkedList<String[]>();
		
		try {
			BufferedReader br= new BufferedReader(new FileReader(file));
			
			while((data=br.readLine())!=null);
			{
				String[] dataRecords=data.split(",");
				data.add(dataRecords);
			}
			
		} catch (FileNotFoundException e)
		{
			// TODO: handle exception
			System.out.println("FILE NOT FOUND.");
		 e.printStackTrace();
		}
		
		catch (IOException e) {
			// TODO: handle exception
			System.out.println("COULD NOT READ FILE.");
			e.printStackTrace();
		}
		
		return data;
	}

}
