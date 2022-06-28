package com.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/message")
	public String getmessage(){
		return "Welcome to Docker demo....!!";
	}

	@GetMapping("/")
	public String conformation(){
		return "conformation to Docker demo.... working!!";
	}

	/*echo "# git-action-cics" >> README.md
	git init
	git add README.md
	git commit -m "first commit"
	git branch -M main
	git remote add origin https://github.com/chandu-mvcr/git-action-cics.git
	git push -u origin main*/
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
