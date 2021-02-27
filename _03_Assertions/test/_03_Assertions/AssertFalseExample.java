package _03_Assertions;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.atul.model.Book;
import com.atul.service.BookService;

class AssertFalseExample {

	@Test
	void assertFalseWithNoMessage()
	{
		BookService bookService = new BookService();
		bookService.addBook(new Book("1","Harry potter","Techmax"));
		List<Book> bookList = bookService.getBooks();
		assertFalse(bookList.isEmpty());
	}
	
	@Test
	void assertFalseWithMessage()
	{
		BookService bookService = new BookService();
		bookService.addBook(new Book("1","Harry potter","Techmax"));
		List<Book> bookList = bookService.getBooks();
		assertFalse(bookList.isEmpty(),"List is empty");
	}
	
	@Test
	void assertFalseWithSupplierMessage()
	{
		BookService bookService = new BookService();
		bookService.addBook(new Book("1","Harry potter","Techmax"));
		List<Book> bookList = bookService.getBooks();
		assertFalse(bookList.isEmpty(),()->"List is empty");
	}
	
	@Test
	void assertFalseWithBooleanSupplierAndNoMessage()
	{
		BookService bookService = new BookService();
		bookService.addBook(new Book("1","Harry potter","Techmax"));
		List<Book> bookList = bookService.getBooks();
		assertFalse(()->bookList.isEmpty());
	}
	
	@Test
	void assertFalseWithBooleanSupplierAndMessage()
	{
		BookService bookService = new BookService();
		bookService.addBook(new Book("1","Harry potter","Techmax"));
		List<Book> bookList = bookService.getBooks();
		assertFalse(()->bookList.isEmpty(),"List is empty");
	}
	
	@Test
	void assertFalseWithBooleanSupplierAndSupplierMessage()
	{
		BookService bookService = new BookService();
		bookService.addBook(new Book("1","Harry potter","Techmax"));
		List<Book> bookList = bookService.getBooks();
		assertFalse(()->bookList.isEmpty(),()->"List is empty");
	}

}
