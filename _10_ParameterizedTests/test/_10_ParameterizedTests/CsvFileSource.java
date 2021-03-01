package _10_ParameterizedTests;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;


class CsvFileSource 
{
	@ParameterizedTest
	@org.junit.jupiter.params.provider.CsvFileSource(resources = {"resource.csv"})
	public void test(String param1,String param2,String param3)
	{
		assertTrue(param1.isEmpty());
	}
}
