package com.cg.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Users")
@Table(name="user")
public class Users {

	
    @Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", roleCode=" + roleCode + "]";
	}
    
    @Column(name="UserName")
	@Id
	public String  username;
    @Column(name = "Password")
    public String password;
    @Column(name="RoleCode")
    public String roleCode;
	

//	public String getUserName() {
//		return username;
//	}
//
//	public void setUserName(String userName) {
//		this.username = userName;
//	}

	public String getPassWord() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassWord(String passWord) {
		this.password = passWord;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public Users(String userName, String passWord, String roleCode) {
		super();
		this.username = userName;
		this.password = passWord;
		this.roleCode = roleCode;
	}
	
	public Users() {
		
	}
}
