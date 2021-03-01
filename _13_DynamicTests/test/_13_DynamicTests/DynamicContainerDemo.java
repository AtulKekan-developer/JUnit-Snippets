package _13_DynamicTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicContainerDemo 
{
	@TestFactory
	public DynamicNode dynamicContainer()
	{
		List<DynamicTest> dynamicTests = new ArrayList<>();
		dynamicTests.add(DynamicTest.dynamicTest("test 1",()->{assertEquals(1, 2);}));
		dynamicTests.add(DynamicTest.dynamicTest("test 2",()->{assertEquals(1, 3);}));
		dynamicTests.add(DynamicTest.dynamicTest("test 3",()->{assertEquals(1, 4);}));
		dynamicTests.add(DynamicTest.dynamicTest("test 4",()->{assertEquals(1, 5);}));
		dynamicTests.add(DynamicTest.dynamicTest("test 5",()->{assertEquals(1, 6);}));
		DynamicContainer container = DynamicContainer.dynamicContainer("dynamic test container",dynamicTests);
		return container;
	}
}
