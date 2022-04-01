package com.controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserService;
import com.example.demo.UserService.User;

@RestController
@RequestMapping("/")
public class TestRestController {
	@Autowired
	private UserService userSer;

	@GetMapping("/getUserList")
	public List<User> getusersList() {
		return userSer.findAll();
	}

	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable int id) {
		return userSer.findById(id);
	}

	@PostMapping("/updateUser")
	public void updateUser(@RequestBody User user) {
		userSer.updateUser(user);
	}

	public String test() {
		return "test is done!";
	}
}
