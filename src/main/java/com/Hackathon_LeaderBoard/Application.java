package com.Hackathon_LeaderBoard;

import com.Hackathon_LeaderBoard.model.Login;
import com.Hackathon_LeaderBoard.repository.RecruitRepositoryImplementation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Done!!!");
	}

	@Bean
	public CommandLineRunner run(RecruitRepositoryImplementation userRepository) throws Exception {
		return (String[] args) -> {
			Login user1 = new Login(1, "John", "john@domain.com");
			Login user2 = new Login(2, "Julie", "julie@domain.com");
			RecruitRepositoryImplementation.insertUser(user1);
			RecruitRepositoryImplementation.insertUser(user2);
			System.out.println(RecruitRepositoryImplementation.findUserById(1));
		};
	}

}
