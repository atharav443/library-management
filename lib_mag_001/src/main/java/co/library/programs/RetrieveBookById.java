package co.library.programs;


import java.io.IOException;

import co.library.dao.BookDao;
import co.library.dao.DaoFactory;
import co.library.entity.Book;

public class RetrieveBookById {

	public static void main(String[] args) throws IOException {
		
		BookDao dao=DaoFactory.getBookDao();
        int book_id=4;
		Book b2=dao.getBookById(book_id);
		
		if(b2==null) {
			System.out.println("No Book for id:" +book_id);
		}else {
			System.out.println(b2);
		}
		
	}

}
