package co.library.servlet;

import java.io.IOException;


import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.library.entity.Staff;
import co.library.service.StaffService;

import javax.servlet.*;
import javax.servlet.http.*;
public class AddStaffServlet extends HttpServlet {

	
	private static final long serialVersionUID = 102831973239L;
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		req.getRequestDispatcher("/StaffForm.jsp").forward(req, resp);
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
		Integer id=Integer.parseInt(req.getParameter("id"));
		String username=req.getParameter("username");
	    String password=req.getParameter("password");
	    String cpassword=req.getParameter("cpassword");
	    String phone=req.getParameter("phone");
	    String address=req.getParameter("address");
	    String designation=req.getParameter("designation");
	    
	    Staff s= new Staff();
	    s.setStaffId(id);
	    s.setName(username);
	    s.setPassword(password);
	    s.setPhone(phone);
	    s.setAddress(address);
	    s.setDesignation(designation);
	    
	    StaffService service=new StaffService();
	    Map<String,String>errors=new HashMap<String,String>();
	    
	    s=service.addNewStaff(s,errors);
	    
	    
	    if(errors.size()>0 ) {
	    	if(password!=cpassword) {
	    		errors.put("cpassword", "Both passwords are not matching");
	    	}
	    	req.setAttribute("errors", errors);
	    	req.getRequestDispatcher("/StaffForm.jsp").forward(req, resp);
	    }
	    else {
	    	resp.sendRedirect("./registered-staff.jsp");
	    }
	    }
	    
	    
	}

