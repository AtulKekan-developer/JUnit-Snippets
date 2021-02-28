package _03_Assertions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertArrayEqualsExample {

	@Test
	public void arrayEqualsNoMessage()
	{
		assertArrayEquals(new String[] {"1","2","3"},new String[] {"1","2","3"});
	}
	
	@Test
	public void arrayEqualsWithMessage()
	{
		assertArrayEquals(new Integer[] {1,2,3,4,5},new Integer[] {1,2,3,4},"Arrays do not match");
	}
	
	@Test
	public void arrayEqualsWithSupplierMessage()
	{
		assertArrayEquals(new Integer[] {1,2,3,4,5},new Integer[] {1,2,3,4},()->"Arrays do not match");
	}

}
