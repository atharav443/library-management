package co.library.programs;

import java.io.IOException;

import co.library.dao.DaoFactory;
import co.library.dao.StaffDao;
import co.library.entity.Staff;

public class DeleteStaff {

	public static void main(String[] args) throws IOException {
		
		StaffDao dao=DaoFactory.getStaffDao();
		
		int id=3;
		
		Staff s1=dao.getStaffById(id);
		
		if(s1==null) {
			System.out.println("No data found for id "+id);
		}
		else {
			dao.deleteStaff(id);
			System.out.println("Staff with id "+id+" is deleted");
		}
		
		

	}

}
