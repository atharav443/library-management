package co.library.dao;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import co.library.entity.Book;
import co.library.entity.Staff;

public interface BookDao {
  
	
	// CRUD OPERATIONS
			@Insert("insert into book  (id, book_name, author_name, status) values (#{id},#{book_name},#{author_name},#{status})")
			public void addBook(Book book);
		
			
			@Select("select * from book where id=#{id}")
			public Book getBookById(Integer id);
			
		    @Delete("delete from book where id=#{id}")	
			public void deleteBook(Integer id);
		    
		    @Update("update book set book_name=#{book_name},author_name=#{author_name},status=#{status} where id=#{id}")
		    public void UpdateBook(Book book);
		    
		    
			
			//QUERIES
		    @Select("select * from book")
			public List<Book>getAllBooks();
}


