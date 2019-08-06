package Numbers;

public class UserInPutIsNumberOrNot {

	public static void main(String[] args) {
		System.out.println(NumberOrNot("pradeep"));
		
		System.out.println(NumberOrNot("345676"));

	}
	
	static boolean NumberOrNot(String input)
	{
		try
		{
		Integer.parseInt(input);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
	}

}
