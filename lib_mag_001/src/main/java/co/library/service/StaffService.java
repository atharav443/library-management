package co.library.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import co.library.dao.DaoFactory;
import co.library.dao.MemberDao;
import co.library.dao.StaffDao;
import co.library.entity.Member;
import co.library.entity.Staff;

public class StaffService {
   
	

	public Staff addNewStaff(Staff s, Map<String, String> errors) throws IOException {
		
		String uname=s.getName().trim();
//		if(s.getStaffId()==0) {
//			errors.put("id", "id is required");
//		}
		
		if(uname.length()==0) {
			errors.put("username", "username is required");
		}
		else if(uname.length()<3) {
			errors.put("username", "At least 3 letters required for username");
		}
		if(s.getPassword().trim().length()==0) {
			errors.put("password", "Password is required");
		}
		
		if(s.getPhone().trim().length()==0){
			errors.put("phone","Phone Number is required");
		}
		if(s.getAddress().trim().length()==0) {
			errors.put("address","Address is required");
		}
		if(s.getDesignation().trim().length()==0) {
			errors.put("designation", "designation is required");
		}
		if(errors.size()>0) {
			return null;
		}
		
		StaffDao dao=DaoFactory.getStaffDao();
		dao.addStaff(s);
		
		return s;
	}
	
	
	public List<Staff>getAllStaff() throws IOException{
		return DaoFactory.getStaffDao().getAllStaff();
	}


	
}

