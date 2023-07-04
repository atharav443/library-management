package co.library.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.library.dao.BookDao;
import co.library.dao.DaoFactory;
import co.library.dao.StaffDao;
import co.library.entity.Book;
import co.library.entity.Staff;

/**
 * Servlet implementation class DeleteBookById
 */
@WebServlet("/delete-book")
public class DeleteBookById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteBookById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/DeleteBook.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int bookId = Integer.parseInt(req.getParameter("bookId"));

        BookDao dao=DaoFactory.getBookDao();
		
		
		
		Book s1=dao.getBookById(bookId);
		
		if(s1==null) {
			System.out.println("No data found for id "+bookId);
		}
		else {
			dao.deleteBook(bookId);
			req.setAttribute("staffid", bookId);
			System.out.println("Staff with id "+bookId+" is deleted");
			resp.sendRedirect("./deleted-book.jsp");
		}
        	
	}

}
