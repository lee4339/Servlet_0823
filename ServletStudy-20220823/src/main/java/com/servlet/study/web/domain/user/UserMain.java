package com.servlet.study.web.domain.user;

import com.servlet.study.web.servlet.repository.UserRepository;

public class UserMain {

	public static void main(String[] args) {
		UserRepository repository = new UserRepository();
		
		repository.getUserList();
	}
}
