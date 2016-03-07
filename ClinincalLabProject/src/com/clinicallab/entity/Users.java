package com.clinicallab.entity;

public class Users {
  
	private String Id;
	private String role;
	private String userName;
	private String passWord;
	
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Users(String id, String role, String userName, String passWord) {
		super();
		Id = id;
		this.role = role;
		this.userName = userName;
		this.passWord = passWord;
	}


	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Users [Id=" + Id + ", role=" + role + ", userName=" + userName + ", passWord=" + passWord + "]";
	}
	
	
}
