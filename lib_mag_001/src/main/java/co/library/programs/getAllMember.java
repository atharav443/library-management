package co.library.programs;

import java.io.IOException;
import java.util.List;

import co.library.dao.DaoFactory;
import co.library.dao.MemberDao;
import co.library.dao.StaffDao;
import co.library.entity.Member;
import co.library.entity.Staff;

public class getAllMember {

	public static void main(String[] args) throws IOException {
		MemberDao dao=DaoFactory.getMemberDao();
		List<Member>list=dao.getAllMember();
		int n=list.size();
		System.out.println("There are " +n+" members.");
		
		for(Member s:list) {
			System.out.println(s.getMember_id()+" "+s.getUsername()+" "+s.getPassword()+" "+s.getPhone()+" "+s.getAddress());
		}

	}

}
