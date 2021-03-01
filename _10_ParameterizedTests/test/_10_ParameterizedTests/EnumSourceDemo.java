package _10_ParameterizedTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.EnumSource.Mode;

class EnumSourceDemo {

	@ParameterizedTest
	@EnumSource(value = Animal.class)
	void test1(Animal animal) {
		assertNotNull(animal);
	}
	
	@ParameterizedTest
	@EnumSource(value = Animal.class,names = {"TIGER","LION"})
	public void test2(Animal animal)
	{
		assertNotNull(animal);
	}
	
	@ParameterizedTest
	@EnumSource(value = Animal.class,mode = Mode.EXCLUDE,names = {"TIGER","LION"})
	public void test3(Animal animal)
	{
		assertNotNull(animal);
	}
	
	@ParameterizedTest
	@EnumSource(value = Animal.class,mode = Mode.MATCH_ALL,names = {"^C"})
	public void test4(Animal animal)
	{
		assertNotNull(animal);
	}
}
