package _03_Assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertEqualsExample {

	@Test
	public void assertEqualsWithNoMessage()
	{
		assertEquals(12.5,12.5);
	}
	
	@Test
	public void assertEqualsWithMessage()
	{
		assertEquals(30, 12,"Value does not match");
	}
	
	@Test
	public void assertEqualsWithSupplierMessage()
	{
		assertEquals(30,30,()->"Value does not match");
	}

}
