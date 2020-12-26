package com.example.iot.iam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.iot.iam.entity.User;
import com.example.iot.utils.Constants;
import com.example.iot.iam.service.IamService;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/")
public class UserController {
	
	@Autowired
	IamService iamService;
	
	@GetMapping(path = Constants.URL_LIST_USERS)
    public ResponseEntity<?> listUsers() {
        log.info("IoTController:  list users");
        List<User> resource = iamService.getUsers();
        return ResponseEntity.ok(resource);
    }
	
	@PostMapping(path = Constants.URL_ADD_USER)
	public ResponseEntity<?> saveUser(@RequestBody User user) {
        log.info("IoTController:  list users");
        User resource = iamService.saveUser(user);
        return ResponseEntity.ok(resource);
    }
}
