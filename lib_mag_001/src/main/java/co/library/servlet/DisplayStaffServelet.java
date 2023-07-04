package co.library.servlet;
import java.io.IOException;


import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.library.dao.DaoFactory;
import co.library.dao.StaffDao;
import co.library.entity.Staff;
import co.library.service.StaffService;
import co.library.dao.StaffDao;

public class DisplayStaffServelet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StaffService service=new StaffService();
	    req.setAttribute("staffs", service.getAllStaff());
        req.getRequestDispatcher("/StaffDetails.jsp").forward(req, resp);
    }
	
}
