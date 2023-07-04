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
import co.library.service.MemberService;

/**
 * Servlet implementation class LoginMember
 */
@WebServlet("/login-member")
public class LoginMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/LibraryMember.jsp").forward(req, resp);
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		MemberService service=new MemberService();
		Map<String,String> errors=new HashMap<String,String>();
		service.login(username,password,errors);
		
		if(errors.size()>0) {
			
			req.setAttribute("errors", errors);
			req.getRequestDispatcher("/LibraryMember.jsp").forward(req, resp);
		}
		
		else {
			req.setAttribute("username", username);
			
			req.getRequestDispatcher("./Memberpage.jsp").forward(req, resp);
			resp.sendRedirect("./Memberpage.jsp");
		}
		
   
		
	}
	
	


	

}
