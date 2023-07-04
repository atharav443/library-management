package co.library.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.library.dao.BookDao;
import co.library.entity.Book;
import co.library.service.BookService;

/**
 * Servlet implementation class UpdateBook
 */
@WebServlet("/update-book")
public class UpdateBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateBook() {
        
    }

	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/UpdateBook.jsp").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id=Integer.parseInt(req.getParameter("bookId"));
		String bookname=req.getParameter("bookname");
		String authorname=req.getParameter("authorname");
		
		BookService service=new BookService();
		Book book=service.getBookById(id);
		
		book.setBook_name(bookname);
		book.setAuthor_name(authorname);
		
		service.UpdateBook(book);
		System.out.println(book);
		
		resp.sendRedirect("./updated-book.jsp");
	}

}
