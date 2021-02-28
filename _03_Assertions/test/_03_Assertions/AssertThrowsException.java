package _03_Assertions;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.atul.exception.BookNotFoundException;

public class AssertThrowsException 
{
	@Test
	public void assertThrowsNoMessage()
	{
		assertThrows(BookNotFoundException.class,()->{throw new BookNotFoundException("Book not found exception raised");});
	}
	
	@Test
	public void assertThrowsWithMessage()
	{
		assertThrows(BookNotFoundException.class,()->{throw new NullPointerException();},"Failed");
	}
	
	@Test
	public void assertThrowsWithSupplierMessage()
	{
		assertThrows(BookNotFoundException.class,()->{throw new NullPointerException();},()->"Failed");
	}
}
