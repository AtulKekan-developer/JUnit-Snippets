package _06_Assumptions;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

import org.junit.jupiter.api.Test;

public class AssumeFalseDemo {

	@Test
	public void assumeFalseWithMessage()
	{
		assumeFalse(true,"Assumption Failed");
		System.out.println("Assumption passed");
		assertTrue(true);
	}
}
