package _03_Assertions;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.atul.model.Book;
import com.atul.service.BookService;

class AssertNotNull {

	@Test
	public void isNotNullNoMessage()
	{
		BookService bookService = new BookService();
		List<Book> bookList = bookService.getBooks();
		assertNotNull(bookList);
	}
	
	@Test
	public void isNotNullStringMessage()
	{
		BookService bookService = new BookService();
		List<Book> bookList = bookService.getBooks();
		assertNotNull(bookList,"Booklist does not exist");
	}
	
	@Test
	public void isNotNullSupplierMessage()
	{
		BookService bookService = new BookService();
		List<Book> bookList = null;
		assertNotNull(bookList,()->"Booklist does not exist");
	}

}
