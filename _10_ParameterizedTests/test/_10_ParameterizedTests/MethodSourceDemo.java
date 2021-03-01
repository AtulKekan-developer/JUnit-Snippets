package _10_ParameterizedTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class MethodSourceDemo
{
	@ParameterizedTest
	@MethodSource(value = "stringProvider")//will search in current class
	void test(String param)
	{
		assertNotNull(param);
	}

	public static Stream<String> stringProvider()
	{
		return Stream.of("Dog","Cat","Mouse");
	}
	
	@ParameterizedTest
	@MethodSource("argumentsProvider")
	void test2(String param1,String param2)
	{
		assertEquals(param1,param2);
	}
	
	public static Stream<Arguments> argumentsProvider()
	{
		return Stream.of(
					Arguments.of("one","two"),
					Arguments.of("three","three")
				);
	}
	
}
