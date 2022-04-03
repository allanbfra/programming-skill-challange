package com.programming.skill.challange.core.usecases;

import java.util.logging.Logger;

public class TenthQuestion {
    private static final Logger LOGGER = Logger.getLogger(TenthQuestion.class.getName());

    public static String reverseString(String string) {
        for (int i = string.length() - 1; i >= 0; --i) {
            string += string.charAt(i);
        }

        LOGGER.info("String: " + string);

        return string.substring(string.length()/2);
    }
}
