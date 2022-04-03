package com.programming.skill.challange;

import com.programming.skill.challange.core.usecases.NinthQuestion;
import com.programming.skill.challange.core.usecases.SecondQuestion;
import com.programming.skill.challange.core.usecases.TenthQuestion;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class Application {
	private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

	public static void main(String[] args) {
		SecondQuestion.execute();
		int stringLength = NinthQuestion.calculateStringLength("should be 12");
		String reversedString = TenthQuestion.reverseString("allan");
		LOGGER.info("\nNinthQuestion: " + stringLength +
				"\nTenthQuestion: " + reversedString);
	}

}
