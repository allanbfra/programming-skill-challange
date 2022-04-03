package com.programming.skill.challange;

import com.programming.skill.challange.core.usecases.SecondQuestion;
import com.programming.skill.challange.core.usecases.TenthQuestion;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Application {
	private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

	public static void main(String[] args) {
		SecondQuestion.execute();
		LOGGER.info("TenthQuestion: " + TenthQuestion.reverseString("allan"));
	}

}
