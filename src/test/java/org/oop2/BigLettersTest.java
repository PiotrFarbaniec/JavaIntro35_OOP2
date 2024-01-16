package org.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BigLettersTest {


    @Test
    void forGivenExampleTextShouldReturnTextFormattedToUpperCase() {
        //given
        String text = "Some Text";
        String expResult = "SOME TEXT";

        //when
        BigLetters implement = new BigLetters(text);
        String result1 = implement.formatText(text);

        String result2 = BigLetters.formatToUpperCase(implement);

        //then
        Assertions.assertEquals(expResult, result1);
        Assertions.assertEquals(expResult, result2);

    }
}