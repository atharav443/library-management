package co.library.programs;

import java.io.IOException;

import co.library.dao.DaoFactory;
import co.library.dao.MemberDao;

import co.library.entity.Member;


public class RetrieveMemberById {

	public static void main(String[] args) throws IOException {
         MemberDao dao=DaoFactory.getMemberDao();
		
		int id=2;
		Member s1=dao.getMemberById(id);
		if(s1==null) {
			System.out.println("No Member data for id: "+id);
		}
		else {
			System.out.println(s1);
		}

	}

}
