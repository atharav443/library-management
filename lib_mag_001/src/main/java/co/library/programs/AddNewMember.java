package co.library.programs;

import java.io.IOException;

import co.library.dao.DaoFactory;
import co.library.dao.MemberDao;
import co.library.dao.StaffDao;
import co.library.entity.Member;
import co.library.entity.Staff;

public class AddNewMember {
	public static void main(String[] args) throws IOException {
		MemberDao dao=DaoFactory.getMemberDao();
		
		Member m1=new Member();
		m1.setMember_id(2);
		m1.setUsername("Ramesh");
		m1.setPassword("123ramesh");
		m1.setPhone("99348336");
		m1.setAddress("Dhayari,Pune");
		
		dao.addMember(m1);
		
		System.out.println(m1);
	}
}
