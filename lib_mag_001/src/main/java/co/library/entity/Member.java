package co.library.entity;

import java.util.Objects;

public class Member {
	private Integer member_id;
    private String username;
    private String password;
    private String phone;
    private String address;
    
    
    @Override
	public String toString() {
		return "Member [member_id=" + member_id + ", username=" + username + ", password=" + password + ", phone="
				+ phone + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, member_id, password, phone, username);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(address, other.address) && Objects.equals(member_id, other.member_id)
				&& Objects.equals(password, other.password) && Objects.equals(phone, other.phone)
				&& Objects.equals(username, other.username);
	}
	public Integer getMember_id() {
		return member_id;
	}
	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
   
    
}
