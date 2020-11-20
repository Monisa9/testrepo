package com.cg.service;

import java.util.List;
import java.util.Map;

import com.cg.model.Policy;
import com.cg.model.Users;

public interface LService {

	//Users validate(String username, String password);
	Users validateLogin(String username,String password);
	//Map<Users,List<Policy>>  getPolicies();
}
