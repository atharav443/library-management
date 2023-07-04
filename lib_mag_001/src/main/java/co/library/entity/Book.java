package co.library.entity;

import java.util.Objects;

public class Book {
   
	
	    private Integer id;
	    private String book_name;
	    private String author_name;
	    private String status;
	    
	    public Book(){
	    	
	    	
	    	
	    }

		@Override
		public String toString() {
			return "Book [book_id=" + id + ", book_name=" + book_name + ", author_name=" + author_name
					+ ", status=" + status + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(author_name, id, book_name, status);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return Objects.equals(author_name, other.author_name) && Objects.equals(id, other.id)
					&& Objects.equals(book_name, other.book_name) && Objects.equals(status, other.status);
		}

		public Integer getBook_id() {
			return id;
		}

		public void setBook_id(Integer book_id) {
			this.id = book_id;
		}

		public String getBook_name() {
			return book_name;
		}

		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}

		public String getAuthor_name() {
			return author_name;
		}

		public void setAuthor_name(String author_name) {
			this.author_name = author_name;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
}
