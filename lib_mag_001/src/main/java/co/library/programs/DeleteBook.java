package co.library.programs;

import java.io.IOException;

import co.library.dao.BookDao;
import co.library.dao.DaoFactory;
import co.library.dao.StaffDao;
import co.library.entity.Book;
import co.library.entity.Staff;

public class DeleteBook {
	
public static void main(String[] args) throws IOException {
		
		BookDao dao=DaoFactory.getBookDao();
		
		int id=5;
		
		Book s1=dao.getBookById(id);
		
		if(s1==null) {
			System.out.println("No data found for id "+ id);
		}
		else {
			dao.deleteBook(id);
			System.out.println("Staff with id "+ id +" is deleted");
		}
		
		

	}

}
