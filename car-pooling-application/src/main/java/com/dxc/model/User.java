package com.dxc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection =  "user")
public class User {
	@Id
    private Integer uid;
    private String password;
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String age;
    private float rating;
    public User() {}
    
	public User(Integer uid, String password, String fname, String lname, String email, String phone, String age,
			float rating) {
		super();
		this.uid = uid;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.age = age;
		this.rating = rating;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", password=" + password + ", fname=" + fname + ", lname=" + lname + ", email="
				+ email + ", phone=" + phone + ", age=" + age + ", rating=" + rating + "]";
	}
	
	
    
    


}
