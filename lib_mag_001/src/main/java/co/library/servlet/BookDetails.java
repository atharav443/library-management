package co.library.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.library.service.BookService;
import co.library.service.StaffService;

/**
 * Servlet implementation class BookDetails
 */

@WebServlet("/book-details")
public class BookDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		BookService service=new BookService();
	    req.setAttribute("books", service.getAllBooks());
        req.getRequestDispatcher("/BookDetails.jsp").forward(req, resp);
        
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
