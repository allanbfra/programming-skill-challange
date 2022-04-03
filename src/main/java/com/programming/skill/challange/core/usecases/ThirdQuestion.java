package com.programming.skill.challange.core.usecases;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ThirdQuestion {
    private static final Logger LOGGER = Logger.getLogger(ThirdQuestion.class.getName());

    //This problem presents some inconsistencies:

    // The "for example" section and the second given example contradict themselves.
    // For some reason, the "for example" results only in 6 operations, meanwhile, the second example results in 7,
    // even though the situation is the same. Both "s" and "t" have the length of 3 chars, and go through the same

    // Also, both examples have typos that may mislead the interpretation (i.e. the Exmeple 1 result can only be
    // achieved removing the whitespaces. And, in Exmeple 2, the result can only be achieved by changing the one "tab"
    // by "aba")

    // And, there's no specification about what to do with constrains violations

    // That said, I've decided to return a String if the constrains are violated, and to consider "operations" only as
    // actions that modify the startingString itself.
    public String concatRemove(String startingString, final String desiredString, final int operations) {
        String verifyConstrains = verifyConstrains(startingString, desiredString, operations);
        if (!verifyConstrains.isEmpty()) return verifyConstrains;

        int numberOfOperations = 0;
        int indexOfWhereBothStringsAreEquals = -1;

        //Avoid useless looping
        if (!startingString.isEmpty()) {

            //Finds resemblance point (indexOfWhereBothStringsAreEquals)
            for (int i = 0; i < startingString.length() + 1; i++) {
                //Avoid "trying to access undefined index" error
                if (i < startingString.length() && i < desiredString.length()) {
                    if (startingString.charAt(i) == desiredString.charAt(i)) {
                        indexOfWhereBothStringsAreEquals++;
                    }
                }
            }
        }

        //If there's something to remove, removes char by char until resemblance point
        for (int i = startingString.length(); i > indexOfWhereBothStringsAreEquals + 1; i--) {
            //REMOVE last char
            startingString = startingString.substring(0, startingString.length() - 1);
            numberOfOperations++;
        }

        //Adds the remaining characters from "desiredString"
        for (int i = indexOfWhereBothStringsAreEquals + 1; i < desiredString.length(); i++) {
            //CONCAT at last char
            startingString = startingString.concat(String.valueOf(desiredString.charAt(i)));
            numberOfOperations++;
        }

        LOGGER.info("\nnumberOfOperations: " + numberOfOperations + "\ngivenStringOutput: " + startingString);

        return operations == numberOfOperations ? "YES" : "NO";
    }

    public String verifyConstrains(String startingString, String desiredString, int operations) {
        String stringConstraints = "^[a-záàâãéèêíïóôõöúçñ ]{1,100}+$";
        String operationsConstraints = "^[1-9][0-9]?$|^100$";

        if (!startingString.matches(stringConstraints) || !desiredString.matches(stringConstraints)) {
            return "Constrain violated! String should be 1 <= | String | <= 100 and inside lowercase letters of the " +
                    "Portuguese alphabet, ascii [a-z]";
        }

        if (!String.valueOf(operations).matches(operationsConstraints)) {
            return "Constrain violated! Operations should be 1 <= operations <= 100";
        }

        return "";
    }
}
