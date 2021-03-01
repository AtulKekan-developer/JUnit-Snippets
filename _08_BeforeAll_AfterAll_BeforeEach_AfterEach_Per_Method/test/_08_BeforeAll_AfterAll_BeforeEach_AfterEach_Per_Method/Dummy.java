package _08_BeforeAll_AfterAll_BeforeEach_AfterEach_Per_Method;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
class Dummy 
{
	public Dummy()
	{
		System.out.println("dummy test class instantiated");
	}
	
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("beforeEach");
	}
	
	@AfterEach
	public void afterEach()
	{
		System.out.println("afterEach");
	}
	
	@BeforeAll
	public static void beforeAll() 
	{
		System.out.println("beforeAll");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("afterAll");
	}
	
	@Test
	public void testOne()
	{
		System.out.println("testOne");
	}
	
	@Test
	public void testTwo()
	{
		System.out.println("testTwo");
	}
	
	@Test
	public void testThree()
	{
		System.out.println("testThree");
	}
}
