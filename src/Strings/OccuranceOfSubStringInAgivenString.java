package Strings;

public class OccuranceOfSubStringInAgivenString {

	public static void main(String[] args) {
		
		String txt = "pradeep";         
        String pat = "ep";         
        System.out.println(countFreq(pat, txt)); 

	}
	
	static int countFreq(String pat,String txt)
	{
		int m=pat.length();
		int n=txt.length();
		
		int res=0;
		
		for(int i=0;i<=n-m;i++)
		{
			int j=0;
			for(j=0;j<m;j++)
			{
				if(txt.charAt(i+j) !=pat.charAt(j))
				{
					break;
				}
			}
			if(j==m)
			{
				res++;
				j=0;
			}
		}
		return res;
	}

}
