package _03_Assertions;
import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.atul.model.Book;
import com.atul.service.BookService;

public class AssertNullExample {

	@Test
	public void isNullNoMessage()
	{
		BookService bookService = new BookService();
		List<Book> bookList = bookService.getBooks();
		assertNull(bookList);
	}
	
	@Test
	public void isNullStringMessage()
	{
		BookService bookService = new BookService();
		List<Book> bookList = bookService.getBooks();
		assertNull(bookList,"Booklist exist");
	}
	
	@Test
	public void isNullSupplierMessage()
	{
		BookService bookService = new BookService();
		List<Book> bookList = null;
		assertNull(bookList,()->"Booklist exist");
	}
}
