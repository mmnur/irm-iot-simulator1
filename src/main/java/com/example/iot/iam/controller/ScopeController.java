package com.example.iot.iam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.iot.iam.entity.Scope;
import com.example.iot.utils.Constants;
import com.example.iot.iam.service.IamService;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class ScopeController {
	
	@Autowired
	IamService iamService;
	
	@GetMapping(path = Constants.URL_LIST_SCOPES)
    public ResponseEntity<?> listScopes() {
        log.info("ScopeController:  list scopes");
        List<Scope> resource = iamService.getScopes();
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = Constants.URL_ADD_SCOPE)
	public ResponseEntity<?> saveScope(@RequestBody Scope scope) {
        log.info("ScopeController:  save scope");
        Scope resource = iamService.saveScope(scope);
        return ResponseEntity.ok(resource);
    }
}
