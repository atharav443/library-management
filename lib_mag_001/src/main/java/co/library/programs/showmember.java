package co.library.programs;

import java.io.IOException;

import co.library.dao.BookDao;
import co.library.dao.DaoFactory;
import co.library.dao.MemberDao;
import co.library.entity.Book;
import co.library.entity.Member;

public class showmember {
public static void main(String[] args) throws IOException {
		
		MemberDao dao=DaoFactory.getMemberDao();
        
		Member s=dao.getMember("ath","athraj");
		
		
		
//		if(s==null) {
//			System.out.println("No Book for id:" +book_id);
//		}else {
//			System.out.println(b2);
//		}
		
		System.out.println(s.getMember_id()+" "+s.getUsername()+" "+s.getPassword()+" "+s.getPhone()+" "+s.getAddress());
		
	}
}
