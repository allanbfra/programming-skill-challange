package com.programming.skill.challange.core.usecases;

public class TenthQuestion {
    public static String reverseString(String string) {
        for (int i = string.length() - 1; i >= 0; --i) {
            string += string.charAt(i);
        }

        return string.substring(string.length()/2);
    }
}
