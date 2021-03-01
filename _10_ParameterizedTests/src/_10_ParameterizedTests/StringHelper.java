package _10_ParameterizedTests;

public class StringHelper 
{
	public String reverse(String input)
	{
		String result = null;
		
		if(input == null)
			return result;
		
		if(input.equals(""))
			return result =  "";
		
		char val[] = input.toCharArray();
		
		for(char ch:val)
		{
			result = ch+result;
		}
		
		return result;
	}
}
