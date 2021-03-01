package _11_RepeatedTests;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class RepeatedTestDemo 
{
	@RepeatedTest(name = RepeatedTest.LONG_DISPLAY_NAME,value=5)	
	void test1() 
	{
		assertNotEquals("hello","bye");
	}
	
	@RepeatedTest(name = RepeatedTest.SHORT_DISPLAY_NAME,value=5)	
	void test2() 
	{
		assertNotEquals("hello","bye");
	}
	
	@RepeatedTest(name = "{displayName} is executed for {currentRepetition} time out of {totalRepetitions}",value=5)
	@DisplayName("Custom method name")
	void test3() 
	{
		assertNotEquals("hello","bye");
	}
	
	
}
