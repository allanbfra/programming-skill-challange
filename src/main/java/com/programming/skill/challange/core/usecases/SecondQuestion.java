package com.programming.skill.challange.core.usecases;

import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SecondQuestion {
    private static final Logger LOGGER = Logger.getLogger(SecondQuestion.class.getName());

    public static void execute() {
        Stream<Integer> range = Arrays.stream(IntStream.rangeClosed(1, 100).toArray()).boxed();

        range.forEach(number -> {
            final StringBuilder messageBuilder = new StringBuilder();

            if (number % 3 == 0) messageBuilder.append("Foo");

            if (number % 5 == 0) messageBuilder.append("Baa");

            LOGGER.info(messageBuilder.length() == 0 ? String.valueOf(number) : messageBuilder.toString());
        });
    }
}
