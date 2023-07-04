package co.library.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public final class DaoFactory {
  
	private DaoFactory() {
		
	}
	
	public static StaffDao getStaffDao() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
	    SqlSession session=factory.openSession(true);
	
	    return session.getMapper(StaffDao.class);
	}
	public static BookDao getBookDao() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
	    SqlSession session=factory.openSession(true);
	
	    return session.getMapper(BookDao.class);
	}
	public static MemberDao getMemberDao() throws IOException {
		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
	    SqlSession session=factory.openSession(true);
	
	    return session.getMapper(MemberDao.class);
	}
}
