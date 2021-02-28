package _03_Assertions;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AssertNotEqualsExample 
{
	
	@Test
	public void assertEqualsWithNoMessage()
	{
		assertNotEquals(12.5,12.5);
	}
	
	@Test
	public void assertEqualsWithMessage()
	{
		assertNotEquals(30, 12,"Value matches");
	}
	
	@Test
	public void assertEqualsWithSupplierMessage()
	{
		assertNotEquals(30,30,()->"Value matches");
	}
}
