package com.programming.skill.challange.core.usecases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirdQuestionTest {

    ThirdQuestion thirdQuestion;

    @BeforeEach
    public void init(){
        thirdQuestion = new ThirdQuestion();
    }

    @Test
    public void shouldReturnYES() {
        String result = thirdQuestion.concatRemove("blablablabla", "blablabçde", 8);
        assertEquals("YES", result);
    }

    @Test
    public void shouldReturnNO() {
        String result = thirdQuestion.concatRemove("tab", "aba", 7);
        assertEquals("NO", result);
    }

    @Test
    public void shouldReturnViolatedConstraintsForStringsWithNumbers() {
        String result = thirdQuestion.concatRemove("abc12", "aba", 7);
        assertEquals("Constrain violated! String should be 1 <= | String | <= 100 and inside lowercase " +
                "letters of the Portuguese alphabet, ascii [a-z]", result);
    }

}