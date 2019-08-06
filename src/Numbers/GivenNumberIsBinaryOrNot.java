package Numbers;

public class GivenNumberIsBinaryOrNot {

	public static void main(String[] args) {
		IsBinaryOrNot(12345);
		IsBinaryOrNot(10010101);
		IsBinaryOrNot(00000);

	}
	
	static void IsBinaryOrNot(int number)
	{
		boolean isbinary=true;
		
		int copyOfNumber=number;
		
		while(copyOfNumber != 0)
		{
			int temp=copyOfNumber%10;
			
			if(temp > 1)
			{
				isbinary=false;
				
				break;
			}
			else
			{
				copyOfNumber=copyOfNumber/10;
			}
		}
		if (isbinary)
        {
            System.out.println(number+" is a binary number");
        }
        else
        {
            System.out.println(number+" is not a binary number");
        }
	}

}
