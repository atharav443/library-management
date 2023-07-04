package co.library.programs;

import java.io.IOException;
import java.util.List;

import co.library.dao.DaoFactory;
import co.library.dao.StaffDao;
import co.library.entity.Staff;

public class getAllStaff {

	public static void main(String[] args) throws IOException {
		StaffDao dao=DaoFactory.getStaffDao();
		List<Staff>list=dao.getAllStaff();
		int n=list.size();
		System.out.println("There are " +n+" staff.");
		
		for(Staff s:list) {
			System.out.println(s.getStaffId()+" "+s.getName()+" "+s.getPassword()+" "+s.getPhone()+" "+s.getAddress()+" "+s.getDesignation());
		}

	}

}
