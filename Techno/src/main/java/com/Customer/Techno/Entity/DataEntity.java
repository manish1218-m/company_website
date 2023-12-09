package com.Customer.Techno.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DataEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String fname;
	private String email;
	private long phone;
	private String coname;
	private String message;
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getConame() {
		return coname;
	}
	public void setConame(String coname) {
		this.coname = coname;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public DataEntity(long id, String fname, String email, long phone, String coname, String message) {
		super();
		Id = id;
		this.fname = fname;
		this.email = email;
		this.phone = phone;
		this.coname = coname;
		this.message = message;
	}
	public DataEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DataEntity [Id=" + Id + ", fname=" + fname + ", email=" + email + ", phone=" + phone + ", coname="
				+ coname + ", message=" + message + "]";
	}
	


}
