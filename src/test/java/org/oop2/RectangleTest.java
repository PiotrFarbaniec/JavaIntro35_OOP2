package org.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RectangleTest {

    @Test
    void forTenAndFifteenShouldReturnExpectedArea() {
        //given
        double dimensionA = 10;
        double dimensionB = 15;
        double expResult = 150;

        //when
        Rectangle tested = new Rectangle(dimensionA, dimensionB);
        double result = tested.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forEightAndFourteenShouldReturnExpectedArea() {
        //given
        double dimensionA = 8;
        double dimensionB = 14;
        double expResult = 112;

        //when
        Rectangle tested = new Rectangle(dimensionA, dimensionB);
        double result = tested.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forTenAndFifteenShouldReturnExpectedPerimeter() {
        //given
        double dimensionA = 10;
        double dimensionB = 15;
        double expResult = 50;

        //when
        Rectangle tested = new Rectangle(dimensionA, dimensionB);
        double result = tested.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forEightAndFourteenShouldReturnExpectedPerimeter() {
        //given
        double dimensionA = 8;
        double dimensionB = 14;
        double expResult = 44;

        //when
        Rectangle tested = new Rectangle(dimensionA, dimensionB);
        double result = tested.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }
}