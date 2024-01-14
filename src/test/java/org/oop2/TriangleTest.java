package org.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TriangleTest {

    @Test
    void forTwelveSixteenAndTwentyShouldReturnExpectedArea() {
        //given
        double dimensionA = 12;
        double dimensionB = 16;
        double dimensionC = 20;
        double expResult = 96;

        //when
        Triangle tested = new Triangle(dimensionA, dimensionB, dimensionC);
        double result = tested.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forSixEightAndTenShouldReturnExpectedArea() {
        //given
        double dimensionA = 6;
        double dimensionB = 8;
        double dimensionC = 10;
        double expResult = 24;

        //when
        Triangle tested = new Triangle(dimensionA, dimensionB, dimensionC);
        double result = tested.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forTwelveSixteenAndTwentyShouldReturnExpectedPerimeter() {
        //given
        double dimensionA = 12;
        double dimensionB = 16;
        double dimensionC = 20;
        double expResult = 48;

        //when
        Triangle tested = new Triangle(dimensionA, dimensionB, dimensionC);
        double result = tested.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forSixEightAndTenShouldReturnExpectedPerimeter() {
        //given
        double dimensionA = 6;
        double dimensionB = 8;
        double dimensionC = 10;
        double expResult = 24;

        //when
        Triangle tested = new Triangle(dimensionA, dimensionB, dimensionC);
        double result = tested.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }


}