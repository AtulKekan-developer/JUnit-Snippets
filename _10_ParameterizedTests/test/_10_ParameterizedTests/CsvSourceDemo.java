package _10_ParameterizedTests;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CsvSourceDemo {

	@ParameterizedTest
	@CsvSource({"one , two , three"})
	public void demoOne(String param1,String param2,String param3)
	{
		assertEquals(param1,param2);
	}
	
	@ParameterizedTest
	@CsvSource({"one , 'two,three' "})
	public void demoTwo(String param1,String param2)
	{
		assertTrue(param1 instanceof String);
	}
	
	@ParameterizedTest
	@CsvSource({" one , '' "})
	public void demoThree(String param1,String param2)
	{
		assertTrue(param1 instanceof String);
	}
	
	@ParameterizedTest
	@CsvSource({" one , "})
	public void demoFour(String param1,String param2)
	{
		assertNull(param2);
	}	
	
}
