package com.example.iot.iam.service;

import org.springframework.stereotype.Component;

import com.example.iot.iam.entity.User;
import com.example.iot.iam.repository.UserRepository;
import com.example.iot.iam.entity.Scope;
import com.example.iot.iam.repository.ScopeRepository;
import com.example.iot.iam.entity.Policy;
import com.example.iot.iam.repository.PolicyRepository;

import java.util.List;

@Component
public class IamService {
	
	private UserRepository userRepository;
	private ScopeRepository scopeRepository;
	private PolicyRepository policyRepository;

    public IamService(UserRepository userRepository, ScopeRepository scopeRepository, PolicyRepository policyRepository) {
        this.userRepository = userRepository;
        this.scopeRepository = scopeRepository;
        this.policyRepository = policyRepository;
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    
    public User saveUser(User user) {
    	return userRepository.save(user);
    }

    public List<Scope> getScopes() {
        return scopeRepository.findAll();
    }
    
    public Scope saveScope(Scope scope) {
    	return scopeRepository.save(scope);
    }
    
    public List<Policy> getPolicies() {
        return policyRepository.findAll();
    }
    
    public Policy savePolicy(Policy policy) {
    	return policyRepository.save(policy);
    }
}
