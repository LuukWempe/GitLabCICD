package com.ycn.demo;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitlabcicddemoApplicationTests {

	@Autowired
	public GitLabService gitLabService;

	@Test
	void contextLoads() {
		gitLabService.sayMessage();
		assert gitLabService.sayMessage().equals("Welcome at Young Capital.");
	}

}
