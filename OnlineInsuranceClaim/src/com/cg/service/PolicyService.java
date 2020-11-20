package com.cg.service;

import java.util.List;
import java.util.Map;

import com.cg.model.Policy;
import com.cg.model.Users;

public interface PolicyService {
   
	
	List<Policy> getPolicies(String username);
}
