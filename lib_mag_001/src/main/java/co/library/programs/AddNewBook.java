package co.library.programs;

import java.io.IOException;

import co.library.dao.BookDao;
import co.library.dao.DaoFactory;
import co.library.entity.Book;

public class AddNewBook {

	public static void main(String[] args) throws IOException {
		BookDao dao=DaoFactory.getBookDao();
		
		Book b1=new Book();
		b1.setBook_id(21);
		b1.setBook_name("rtr");
		b1.setAuthor_name("dtghdth");
		b1.setStatus("Not issued");
		
		dao.addBook(b1);
		System.out.println(b1);

	}

}
