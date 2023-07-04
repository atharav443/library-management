package co.library.programs;

import java.io.IOException;

import co.library.dao.DaoFactory;
import co.library.dao.StaffDao;
import co.library.entity.Staff;

public class AddNewStaff {

	public static void main(String[] args) throws IOException {
		StaffDao dao=DaoFactory.getStaffDao();
		
		Staff s2=new Staff();
		s2.setStaffId(2);
		s2.setName("Ramesh");
		s2.setPassword("123ramesh");
		s2.setPhone("99348336");
		s2.setAddress("Dhayari,Pune");
		s2.setDesignation("Manager");
		dao.addStaff(s2);
		
		System.out.println(s2);
	}
	
}
