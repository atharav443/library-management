package co.library.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.library.entity.Book;
import co.library.service.BookService;

/**
 * Servlet implementation class UpdateStatusOfBook
 */
@WebServlet("/issue-book")
public class UpdateStatusOfBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/IssueBook.jsp").forward(req, resp);
	}

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer id=Integer.parseInt(req.getParameter("BookID"));
		
		
		BookService service=new BookService();
		Book book=service.getBookById(id);
		
		book.setStatus("Issued");
		
		
		service.UpdateBook(book);
		System.out.println(book);
		
		resp.sendRedirect("./issued-book.jsp");
	}


}
