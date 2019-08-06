package Conversations;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayListUsingArrayASMethod {

	public static void main(String[] args) {
		
		String[] array=new String[] {"pradeep","kumar","pamba","practice","java"};
		
		ArrayList<String> arrayList=new ArrayList<String>(Arrays.asList(array));
		
		System.out.println(arrayList);
	}

}
