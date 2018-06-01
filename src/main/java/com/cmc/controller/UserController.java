package com.cmc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cmc.dto.QuestionDTO;
import com.cmc.service.UserService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/getProfile", method = RequestMethod.POST)
	public ResponseEntity<String> saveUser(@RequestBody QuestionDTO questionDTO) {	
	return new ResponseEntity<>(userService.getProfile(questionDTO), HttpStatus.OK);
	}
}