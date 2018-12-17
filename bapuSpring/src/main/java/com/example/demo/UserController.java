package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user")
public class UserController {

	@Autowired
	UsersRepo ur;
	@GetMapping
	public String toTest() {
		return "Welcome to Java programming";
	}
	@GetMapping(path="/getusernames")
	public String getAllUserNames(){
		String str;
		Iterator<String> it = ur.getAllUserNames().iterator();
		str="<ol>";
		while (it.hasNext()) {
			str+="<li>"+it.next()+"</li>";
			
		}
		str+="</ol>";
		return str;
	}
	@GetMapping(path="/getAll")
	public List<String> getAllUserNamesAndUID(){
		
		return ur.getAllUserNamesAndUID();
	}
}
