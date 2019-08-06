package Strings;

public class ReverseStringUsingIterative {

	public static void main(String[] args) {
		String str=" MyJava program ";
		char[] ch = str.toCharArray();
		String reverse="";
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse=reverse+ch[i];
		}
		System.out.println(reverse);
	}
}
