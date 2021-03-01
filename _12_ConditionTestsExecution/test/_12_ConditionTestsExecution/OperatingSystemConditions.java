package _12_ConditionTestsExecution;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class OperatingSystemConditions 
{

	@Test
	@DisabledOnOs(OS.WINDOWS)
	void test1() {
		assertEquals(5, 5);
	}

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void test2() {
		assertEquals(5, 5);
	}
}
