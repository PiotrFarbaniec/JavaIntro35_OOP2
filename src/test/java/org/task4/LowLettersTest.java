package org.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LowLettersTest {

    @Test
    void forGivenExampleTextShouldReturnTextFormattedToLowerCase() {
        //given
        String text = "Some Text To Format";
        String expResult = "some text to format";

        //when
        LowLetters implement = new LowLetters();
        String result = implement.formatText(text);

        //then
        Assertions.assertEquals(expResult, result);

    }
}