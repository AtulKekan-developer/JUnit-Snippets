package _06_Assumptions;

import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.*;

public class AssumingThatDemo {

	@Test
	public void assumingThatDemo()
	{
		assumingThat(true,()->{System.out.println("Assumtion is true");});
	}
}
