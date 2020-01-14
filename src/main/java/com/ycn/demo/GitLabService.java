package com.ycn.demo;

import org.springframework.stereotype.Service;

@Service
public class GitLabService {
	
	String msg = "Welcome at Young Capital.";

	public GitLabService(){
	}

	public String sayMessage(){
		return msg;
	}
}
