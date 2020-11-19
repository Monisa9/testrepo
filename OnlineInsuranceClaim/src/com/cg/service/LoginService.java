package com.cg.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.cg.dao.Ldao;
import com.cg.model.Account;
import com.cg.model.Policy;
import com.cg.model.Users;

@Component(value = "service")
public class LoginService implements LService {
	
	@Qualifier(value="jdbcDao")
	@Autowired
	private Ldao ldao;
	
	/*@Override
	public Users validate(String username,String password) {
		System.out.println("Inside service layer..");
		Users u=new Users();
		if(username.equals("1000") && password.equals("root123"))
			u.setRoleCode("Admin");
		else if(username.equals("1001") && password.equals("agentA"))
			u.setRoleCode("Agent");
		else if(username.equals("2001") && password.equals("user1"))
			u.setRoleCode("User");
		
	
		return u;
		
	}*/

	@Override
	public Users validateLogin(String username, String password) {
		
		List<Users> list=ldao.retrieveUsers();
		
		for(Users user:list) {
			
			if(user.getUsername().equals(username) && user.getPassWord().equals(password)) 
			{
				return user;
			}
		}
			return null;
	}

	
	
	
	@Override
	public Map<Users,List<Policy>>  getPolicies() {
		
		Map<Users,List<Policy>> resMap=new HashMap<>();
		
		
		List<Users> ulist = ldao.retrieveUsers();
		List<Account> alist=ldao.retrieveAccounts();
		List<Policy> plist=ldao.retrievePolicies();
		
		for(Users u:ulist) 
		{
			List<Policy> resp=new ArrayList<>();
			
			for(Account a:alist) 
			{
				if(u.getUsername().equals(a.getUserName()))
				{  	
					Account temp=a;
					
					for(Policy p:plist) 
					{
						if(temp.getAccountNumber()==p.getAccountNumber())
						{
							resp.add(p);
						}
						
						resMap.put(u, resp);
					}
				}
				
			}
		}
		return resMap;//need to change the logic!...
	}

	
	

}
