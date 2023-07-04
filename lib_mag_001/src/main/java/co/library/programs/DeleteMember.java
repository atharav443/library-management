package co.library.programs;

import java.io.IOException;

import co.library.dao.BookDao;
import co.library.dao.DaoFactory;
import co.library.dao.MemberDao;
import co.library.entity.Book;
import co.library.entity.Member;

public class DeleteMember {
	
	public static void main(String[] args) throws IOException {
	MemberDao dao=DaoFactory.getMemberDao();
	
	int id=2;
	
	Member s1=dao.getMemberById(id);
	
	if(s1==null) {
		System.out.println("No data found for id "+ id);
	}
	else {
		dao.deleteMember(id);
		System.out.println("Member with id "+ id +" is deleted");
	}
}}
