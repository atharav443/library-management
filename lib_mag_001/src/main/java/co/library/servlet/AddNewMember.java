package co.library.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.library.entity.Member;
import co.library.entity.Staff;
import co.library.service.MemberService;
import co.library.service.StaffService;

/**
 * Servlet implementation class AddNewMember
 */
@WebServlet("/add-new-member")
public class AddNewMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/MemberRegistration.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		     
		Integer id=Integer.parseInt(req.getParameter("id"));
		String username=req.getParameter("username");
	    String password=req.getParameter("password");
	    String phone=req.getParameter("phone");
	    String address=req.getParameter("address");
	   
	    
	    Member m= new Member();
	    m.setMember_id(id);
	    m.setUsername(username);
	    m.setPassword(password);
	    m.setPhone(phone);
	    m.setAddress(address);
	   
	    MemberService service=new MemberService();
	    Map<String,String>errors=new HashMap<String,String>();
	    
	    m=service.addNewMember(m,errors);
	    
	    
	    
	    if(errors.size()>0 ) {
	    	
	    	req.setAttribute("errors", errors);
	    	req.getRequestDispatcher("/MemberRegistration.jsp").forward(req, resp);
	    }
	    else {
	    	resp.sendRedirect("./registered-member.jsp");
	    	}
	    
	    
	    
	}

}
