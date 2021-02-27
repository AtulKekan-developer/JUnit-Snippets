package _03_Assertions;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.atul.model.Book;
import com.atul.service.BookService;

class AssertTrueExample {

	@Test
	public void assertTrueWithNoMessage()
	{
		BookService bookService = new BookService();
		Book headFirstJava = new Book("1","Head first java","Wrox");
		bookService.addBook(headFirstJava);
		List<Book> listBooks = bookService.getBooks();
		assertTrue(listBooks.isEmpty());
	}

	@Test
	public void assertTrueWithMessage()
	{
		BookService bookService = new BookService();
		Book headFirstJava = new Book("1","Head first java","Wrox");
		bookService.addBook(headFirstJava);
		List<Book> listBooks = bookService.getBooks();
		assertTrue(listBooks.isEmpty(),"List of books is not empty");
	}
	
	@Test
	public void assertTrueWithMessageSupplier()
	{
		BookService bookService = new BookService();
		Book headFirstJava = new Book("1","Head first java","Wrox");
		bookService.addBook(headFirstJava);
		List<Book> listBooks = bookService.getBooks();
		assertTrue(listBooks.isEmpty(),() ->"List of books is not empty");
	}
	
	@Test
	public void assertTrueWithBooleanSupplierAndNoMessage()
	{
		BookService bookService = new BookService();
		Book headFirstJava = new Book("1","Head first java","Wrox");
		bookService.addBook(headFirstJava);
		List<Book> listBooks = bookService.getBooks();
		assertTrue(()->listBooks.isEmpty());
	}
	
	@Test
	public void assertTrueWithBooleanSupplierAndMessage()
	{
		BookService bookService = new BookService();
		Book headFirstJava = new Book("1","Head first java","Wrox");
		bookService.addBook(headFirstJava);
		List<Book> listBooks = bookService.getBooks();
		assertTrue(()->listBooks.isEmpty(),"List of books is not empty");
	}
	
	@Test
	public void assertTrueWithBooleanSupplierAndMessageSupplier()
	{
		BookService bookService = new BookService();
		Book headFirstJava = new Book("1","Head first java","Wrox");
		bookService.addBook(headFirstJava);
		List<Book> listBooks = bookService.getBooks();
		assertTrue(()->listBooks.isEmpty(),()->"List of books is not empty");
	}
}
