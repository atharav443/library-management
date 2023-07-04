package co.library.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import co.library.entity.Staff;

public interface StaffDao {
   
	// CRUD OPERATIONS
	@Insert("insert into staff  (staff_id,name, password, phone, address, designation) values (#{staff_id},#{name},#{password},#{phone},#{address},#{designation})")
	
	public void addStaff(Staff staff);
	
	@Select("select * from staff where staff_id=#{staff_id}")
	public Staff getStaffById(Integer id);
	
    @Delete("delete from staff where staff_id=#{staff_id}")	
	public void deleteStaff(Integer id);
	
	//QUERIES
    @Select("select * from staff")
	public List<Staff>getAllStaff();
	
}
