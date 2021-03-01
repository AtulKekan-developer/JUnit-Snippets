package _07_TestInstanceLifecycle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class PerClass {

	public PerClass()
	{
		System.out.println("Test class instantiated");
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void test2() {
		fail("Not yet implemented");
	}
	

}
