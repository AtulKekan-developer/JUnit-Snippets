package _04_DisplayNameAnnotation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test class")
class DisplayNameExample {

	@Test
	@DisplayName("Test method")
	public void displayNameDemoTest()
	{
		assertEquals(3,7);
	}
}
