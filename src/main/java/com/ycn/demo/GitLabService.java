package com.ycn.demo;

import org.springframework.stereotype.Service;

@Service
public class GitLabService {
	
	String hallo = "hallo";

	public GitLabService(){

	}

	public String sayHello(){
		return "Hello World!";
	}
}
