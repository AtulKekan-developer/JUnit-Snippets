package com.atul.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.atul.model.Book;

public class BookService 
{
	private List<Book> bookList = new ArrayList<Book>();
	
	public void addBook(Book book)
	{
		bookList.add(book);
	}
	
	public List<Book> getBooks()
	{
		return Collections.unmodifiableList(bookList);
	}
}
