package co.library.service;

import java.io.IOException;
import java.util.Map;

import co.library.dao.DaoFactory;
import co.library.dao.MemberDao;
import co.library.entity.Member;

public class MemberService {

	
	public Member addNewMember(Member m, Map<String, String> errors) throws IOException {

		if(m.getUsername().trim().length()==0) {
			errors.put("username", "username is required");
		}
		
		if(m.getPassword().trim().length()==0) {
			errors.put("password", "Password is required");
		}
		
		if(m.getPhone().trim().length()==0){
			errors.put("phone","Phone Number is required");
		}
		if(m.getAddress().trim().length()==0) {
			errors.put("address","Address is required");
		}
		
		if(errors.size()>0) {
			return null;
		}
		
		MemberDao dao=DaoFactory.getMemberDao();
		dao.addMember(m);
		
		return m;
	}

	public void login(String username, String password, Map<String, String> errors) throws IOException {
		if(username.trim().length()==0) {
			errors.put("username", "username is required");
		}
		
		if(password.trim().length()==0) {
			errors.put("password", "Password is required");
		}
		
		
		MemberDao dao=DaoFactory.getMemberDao();
//		Member member=dao.getMemberByUsername(username);
		System.out.println(username);
		System.out.println(password);
		Member m=dao.getMember(username, password);
		if(m==null){
			errors.put("username", "Invalid username");
			return;
	    }
		else {
				
		return;}
		}

}
