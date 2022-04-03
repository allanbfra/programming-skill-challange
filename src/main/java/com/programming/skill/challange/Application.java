package com.programming.skill.challange;

import com.programming.skill.challange.core.usecases.SecondQuestion;
import com.programming.skill.challange.core.usecases.TenthQuestion;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		SecondQuestion.execute();
		TenthQuestion.reverseString("allan");
	}

}
