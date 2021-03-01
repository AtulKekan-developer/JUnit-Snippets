package _06_Assumptions;

import static org.junit.Assume.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test class")
class AssumeTrueDemo {

	@Test
	@DisplayName("Test method")
	public void assumeTrueWithNoMessage()
	{
		assumeTrue("DEV".equals(System.getProperty("ENV")));//-> execute test case if environment is dev
		System.out.println("Assumption true");
		assertEquals(3,3);
	}

}
