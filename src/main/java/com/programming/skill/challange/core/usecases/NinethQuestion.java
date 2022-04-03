package com.programming.skill.challange.core.usecases;

public class NinethQuestion {
    public int calculateStringLength(String string){
        int length=0;
        char[] charArray = string.toCharArray();

        for (char c : charArray) {
            length++;
        }

        return length;

        // Dunno if this way is valid since i'm using a pre-existing function, but it's from Collectors,
        // so I'm leaving it here commented: return Stream.of(string).collect(Collectors.counting());
    }
}
