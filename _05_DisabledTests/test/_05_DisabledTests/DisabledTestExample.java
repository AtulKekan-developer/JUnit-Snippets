package _05_DisabledTests;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled
class DisabledTestExample {

	@Test	
	@Disabled
	void testOne()
	{
		assertNull(null);
	}
	
	@Test
	void testTwo()
	{
		assertNull(new String());
	}

}
