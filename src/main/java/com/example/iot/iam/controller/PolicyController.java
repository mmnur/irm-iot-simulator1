package com.example.iot.iam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.iot.iam.entity.Policy;
import com.example.iot.utils.Constants;
import com.example.iot.iam.service.IamService;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class PolicyController {
	
	@Autowired
	IamService iamService;
	
	@GetMapping(path = Constants.URL_LIST_POLICIES)
    public ResponseEntity<?> listPolicys() {
        log.info("PolicyController:  list policies");
        List<Policy> resource = iamService.getPolicies();
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = Constants.URL_ADD_POLICY)
	public ResponseEntity<?> savePolicy(@RequestBody Policy policy) {
        log.info("PolicyController:  save policy");
        Policy resource = iamService.savePolicy(policy);
        return ResponseEntity.ok(resource);
    }
}
