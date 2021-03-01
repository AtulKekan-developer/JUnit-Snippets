package _13_DynamicTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

class DynamicTestDemo 
{
	@TestFactory
	public DynamicNode dynamicTest()
	{
		return DynamicTest.dynamicTest("Dynamic test method",()->{assertEquals(1,10);});
	}
	
	
	@TestFactory
	public Collection<DynamicTest> collectionTest()
	{
		List<DynamicTest> dynamicTests = new ArrayList<>();
		dynamicTests.add(DynamicTest.dynamicTest("test 1",()->{assertEquals(1, 2);}));
		dynamicTests.add(DynamicTest.dynamicTest("test 2",()->{assertEquals(1, 3);}));
		dynamicTests.add(DynamicTest.dynamicTest("test 3",()->{assertEquals(1, 4);}));
		dynamicTests.add(DynamicTest.dynamicTest("test 4",()->{assertEquals(1, 5);}));
		dynamicTests.add(DynamicTest.dynamicTest("test 5",()->{assertEquals(1, 6);}));
		return dynamicTests;
	}
}
