package org.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BigLettersTest {

    @Test
    void forGivenExampleTextShouldReturnTextFormattedToUpperCase() {
        //given
        String text = "Some Text";
        String expResult = "SOME TEXT";

        //when
        BigLetters implement = new BigLetters();
        String result = implement.formatText(text);


        //then
        Assertions.assertEquals(expResult, result);

    }
}