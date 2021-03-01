package _07_TestInstanceLifecycle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
@DisplayName("Test class")
class PerMethod 
{
	public PerMethod()
	{
		System.out.println("test class instantiated");
	}
	@Test
	void method1()
	{
		assertTrue(true);
	}
	
	@Test
	void method2()
	{
		assertFalse(false);
	}
}
