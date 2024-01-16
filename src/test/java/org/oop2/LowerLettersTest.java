package org.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowerLettersTest {

    @Test
    void forGivenExampleTextShouldReturnTextFormattedToUpperCase() {
        //given
        String text = "Some Text To Format";
        String expResult = "some text to format";

        //when
        LowerLetters implement = new LowerLetters(text);

        String result1 = implement.formatText(text);
        String result2 = LowerLetters.formatToLowerCase(implement);

        //then
        Assertions.assertEquals(expResult, result1);
        Assertions.assertEquals(expResult, result2);

    }
}