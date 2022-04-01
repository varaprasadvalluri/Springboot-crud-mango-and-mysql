package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class UserService {

	public static class User {
		private int id;
		private String name;
		private Date date;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public User(int id, String name, Date date) {
			super();
			this.id = id;
			this.name = name;
			this.date = date;
		}

	}

	static int count = 0;
	static List<User> user = null;
	static {
		user = new ArrayList<User>();
		user.add(new User(count++, "test", new Date()));
		user.add(new User(count++, "test", new Date()));

	}

	public List<User> findAll() {
		return user;
	}

	public User findById(int id) {
		if (user.get(id) == null) {
			throw new RuntimeException("User id not found!");
		}
		return user.get(id);
	}

	public int updateUser(User userObj) {
		if (userObj.getId() == 0) {
			userObj.setId(count++);
		}
		user.add(userObj);
		return 1;
	}
}
