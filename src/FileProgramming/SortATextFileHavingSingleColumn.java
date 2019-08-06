package FileProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortATextFileHavingSingleColumn {

	public static void main(String[] args) {
		
		BufferedReader reader=null;
		
		BufferedWriter writer=null;
		
		ArrayList<String> line=new ArrayList<String>();
		
		try {
			   reader=new BufferedReader(new FileReader("/home/pradeep/Documents/text"));
			   String currentLine = reader.readLine();
			
			   while(currentLine != null)
			    {
				  line.add(currentLine);
				
				  currentLine=reader.readLine();
			     }
			
			   Collections.sort(line);
		
				writer=new BufferedWriter(new FileWriter("/home/pradeep/Documents/output.txt"));
				
				for(String singleLine : line)
				{
					if(singleLine != null)
					{
						writer.write(singleLine);
						
						writer.newLine();
					}
				}
				
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		finally {
			
			try {
				
			   if(reader !=null)
			      {
				
					reader.close();
			      }
			   if(writer != null)
			   {
				   writer.close();
			   }
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
		 }
		
		System.out.println("Operation Completed");

	}

}
