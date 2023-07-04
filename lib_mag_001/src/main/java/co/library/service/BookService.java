package co.library.service;

import java.io.IOException;
import java.util.List;

import co.library.dao.DaoFactory;
import co.library.entity.Book;
import co.library.entity.Staff;

public class BookService {

	
	
	public List<Book>getAllBooks() throws IOException{
		return DaoFactory.getBookDao().getAllBooks();
	}
	public Book getBookById(Integer id) throws IOException {
		return DaoFactory.getBookDao().getBookById(id);
	}
	
	 public void UpdateBook(Book book)throws IOException {
		 DaoFactory.getBookDao().UpdateBook(book);
		 return;
	 }
}
