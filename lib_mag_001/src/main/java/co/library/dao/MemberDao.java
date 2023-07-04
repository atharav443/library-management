package co.library.dao;

import java.util.List;


import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import co.library.entity.Member;


public interface MemberDao {

	// CRUD OPERATIONS
	@Insert("insert into member  (member_id,username, password, phone, address) values (#{member_id},#{username},#{password},#{phone},#{address})")
	public void addMember(Member member);
	
	@Select("select * from member where member_id=#{member_id}")
	public Member getMemberById(Integer id);
	
    @Delete("delete from member where member_id=#{member_id}")	
	public void deleteMember(Integer id);
	
	//QUERIES
    @Select("select * from member")
	public List<Member>getAllMember();
    
    @Select("select * from member where username=#{username}")
	public Member getMemberByUsername(String username);
    
    @Select("select * from member where username=#{username} AND password=#{password}")
    public Member getMember(@Param("username")String username,@Param("password")String password);
    
    
}
