package com.attraya.blog;

import org.springframework.boot.SpringApplication;

public class TestSpringbootBlogApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringbootBlogApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
