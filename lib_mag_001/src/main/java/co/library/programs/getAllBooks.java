package co.library.programs;

import java.io.IOException;
import java.util.List;

import co.library.dao.BookDao;
import co.library.dao.DaoFactory;
import co.library.dao.StaffDao;
import co.library.entity.Book;
import co.library.entity.Staff;

public class getAllBooks {

	public static void main(String[] args) throws IOException {
		BookDao dao=DaoFactory.getBookDao();
		List<Book>list=dao.getAllBooks();
		int n=list.size();
		System.out.println("There are " +n+" books.");
		
		for(Book s:list) {
			System.out.println(s.getBook_id()+" "+s.getBook_name()+" "+s.getAuthor_name()+" "+s.getStatus());
		}

	}

}
