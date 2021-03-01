package _10_ParameterizedTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;

class NullEmpty_NullANDEmpty 
{
	@ParameterizedTest
	@NullSource
	//@ValueSource(strings = {"Atul","Shivaji","Kekan"})
	void reverseStringTestForNull(String value) 
	{
		StringHelper help = new StringHelper();
		assertNotNull(help.reverse(value),()->"Value is null");
	}
	
	@ParameterizedTest
	@EmptySource
	//@ValueSource(strings = {"Atul","Shivaji","Kekan"})
	void reverseStringTestForEmpty(String value) 
	{
		StringHelper help = new StringHelper();
		assertNotEquals("",help.reverse(value),()->"Value is empty");
	}
	
	@ParameterizedTest
	@NullAndEmptySource
	//@ValueSource(strings = {"Atul","Shivaji","Kekan"})
	void reverseStringTestForEmptyAndNull(String value) 
	{
		StringHelper help = new StringHelper();
		assertEquals(value,help.reverse(value),()->"Value is not empty or null");
	}

}
