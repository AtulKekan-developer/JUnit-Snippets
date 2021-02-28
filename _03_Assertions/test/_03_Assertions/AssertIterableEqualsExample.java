package _03_Assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class AssertIterableEqualsExample {

	@Test
	void assertIterableEqualsNoMessage() 
	{
		List<String> expected = new ArrayList<String>();
		expected.add("A");
		expected.add("B");
		expected.add("C");
		List<String> actual = new ArrayList<String>(); 
		actual.add("A");
		actual.add("B");
		actual.add("C");
		assertIterableEquals(expected, actual);
	}
	
	@Test
	void assertIterableEqualsWithMessage() 
	{
		List<String> expected = new ArrayList<String>();
		expected.add("A");
		expected.add("B");
		expected.add("C");
		List<String> actual = new ArrayList<String>(); 
		actual.add("A");
		actual.add("B");
		actual.add("D");
		assertIterableEquals(expected, actual,"Not equal");
	}
	
	@Test
	void assertIterableEqualsSupplierMessage() 
	{
		List<String> expected = new ArrayList<String>();
		expected.add("A");
		expected.add("B");
		expected.add("C");
		List<String> actual = new ArrayList<String>(); 
		actual.add("A");
		actual.add("B");
		actual.add("D");
		assertIterableEquals(expected, actual,()->"Not equal");
	}

}
