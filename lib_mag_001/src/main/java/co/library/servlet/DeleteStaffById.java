package co.library.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.library.dao.DaoFactory;
import co.library.dao.StaffDao;
import co.library.entity.Staff;

/**
 * Servlet implementation class DeleteStaffById
 */
@WebServlet("/delete-staff")
public class DeleteStaffById extends HttpServlet {
	private static final long serialVersionUID = 102831973239L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteStaffById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/DeleteStaff.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int staffId = Integer.parseInt(req.getParameter("staffId"));

        StaffDao dao=DaoFactory.getStaffDao();
		
		
		
		Staff s1=dao.getStaffById(staffId);
		
		if(s1==null) {
			System.out.println("No data found for id "+staffId);
		}
		else {
			dao.deleteStaff(staffId);
			req.setAttribute("staffid", staffId);
			System.out.println("Staff with id "+staffId+" is deleted");
			resp.sendRedirect("./deleted-staff-msg.jsp");
		}
        
	}

}
