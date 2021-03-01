package _10_ParameterizedTests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValueSourceDemo 
{
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5,6,7,8,9,10})
	public void testEvenValues(int value)
	{
		Calculator calculator = new Calculator();
		assertTrue(calculator.isEven(value),value+" is not even");
	}
}
