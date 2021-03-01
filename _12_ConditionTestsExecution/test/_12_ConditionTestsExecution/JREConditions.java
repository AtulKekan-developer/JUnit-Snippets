package _12_ConditionTestsExecution;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

class JREConditions
{
	
	@Test
	@EnabledOnJre(JRE.JAVA_8)
	void test() {
		assertThrows(NullPointerException.class,()->{throw new ArrayIndexOutOfBoundsException();});
	}
	
	
}
