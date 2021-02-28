package _03_Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import com.atul.model.Book;
import com.atul.service.BookService;

class AssertTimeoutExample 
{
	@Test
	void assertTimeoutNoMessage()
	{
		BookService bookService = new BookService();
		for(int i = 0;i<10000;i++)
		{
			bookService.addBook(new Book("1","ABC","XYZ"));
		}
		List<Book> bookList = new ArrayList<Book>();
		assertTimeout(Duration.ofNanos(1),()->bookList.addAll(bookService.getBooks()));
		assertEquals(bookList.size(),10000,"All books not received");
	}
	
	@Test
	void assertTimeoutWithMessage()
	{
		BookService bookService = new BookService();
		for(int i = 0;i<10000;i++)
		{
			bookService.addBook(new Book("1","ABC","XYZ"));
		}
		List<Book> bookList = new ArrayList<Book>();
		assertTimeout(Duration.ofNanos(1),()->bookList.addAll(bookService.getBooks()),"Timeout exceeded");
		assertEquals(bookList.size(),10000,"All books not received");
	}
	
	@Test
	void assertTimeoutWithSupplierMessage()
	{
		BookService bookService = new BookService();		
		List<Book> bookList = bookService.getBooks();
		assertTimeout(Duration.ofNanos(1),()->{for(int i = 0;i<10000;i++)
		{
			bookService.addBook(new Book("1","ABC","XYZ"));
		}},()->"Timeout exceeded");
		assertEquals(bookList.size(),10000,"All books not received");
	}

}
