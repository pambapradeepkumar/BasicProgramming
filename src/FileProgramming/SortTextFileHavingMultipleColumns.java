package FileProgramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortTextFileHavingMultipleColumns {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader reader=new BufferedReader(new FileReader("/home/pradeep/Documents/text"));
		
		ArrayList<Student> studentRecords = new ArrayList<Student>();
		
		String currentLine = reader.readLine();
				
		while(currentLine != null)
		{
			String[] studentDetail = currentLine.split(" ");
			
			String name = studentDetail[0];
			
			Integer marks = Integer.valueOf(studentDetail[1]);
			
			studentRecords.add(new Student(name,marks));
			
			currentLine = reader.readLine();
		}
		
		//Sorting ArrayList studentRecords based on marks
        
        Collections.sort(studentRecords, new MarksCompare());
		
		
		BufferedWriter writer=new BufferedWriter(new FileWriter("/home/pradeep/Documents/output2.txt"));
		
		//Writing every studentRecords into output text file
        
        for (Student student : studentRecords) 
        {
            writer.write(student.name);
             
            writer.write(" "+student.marks);
             
            writer.newLine();
        }
         
        //Closing the resources
         
        reader.close();
         
        writer.close();
		
	}
	

}

class Student 

{
	public String name;
	public int marks;
	
	
	public Student(String name , int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	
}


class MarksCompare  implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s2.marks-s1.marks;
	}
	
}


class NameCompare implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.name.compareTo(s2.name);
		
	}
	
	
}
