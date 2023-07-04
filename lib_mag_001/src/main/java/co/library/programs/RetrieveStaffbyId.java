package co.library.programs;

import java.io.IOException;

import co.library.dao.DaoFactory;
import co.library.dao.StaffDao;
import co.library.entity.Staff;

public class RetrieveStaffbyId {
    
	public static void main(String args[]) throws IOException {
		
		StaffDao dao=DaoFactory.getStaffDao();
		
		int staff_id=1;
		Staff s1=dao.getStaffById(staff_id);
		if(s1==null) {
			System.out.println("No Staff data for id: "+staff_id);
		}
		else {
			System.out.println(s1);
		}
		
	}
}
