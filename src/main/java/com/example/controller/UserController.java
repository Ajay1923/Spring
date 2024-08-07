package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.css.UserCSS;
import com.example.model.User;

@RestController
public class UserController {

	@Autowired
	UserCSS usercss;
	
	@RequestMapping("index")
	public String user()
	{
		return "index.jsp";
	}
	
	
}
