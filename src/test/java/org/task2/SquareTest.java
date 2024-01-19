package org.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SquareTest {

    @Test
    void forTwentyFiveShouldReturnExpectedArea() {
        //given
        double dimension = 25;
        double expResult = 625;

        //when
        Square tested = new Square(dimension, dimension);
        double result = tested.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forNineShouldReturnExpectedArea() {
        //given
        double dimension = 9;
        double expResult = 81;

        //when
        Square tested = new Square(dimension, dimension);
        double result = tested.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forTwentyFiveShouldReturnExpectedPerimeter() {
        //given
        double dimension = 25;
        double expResult = 100;

        //when
        Square tested = new Square(dimension, dimension);
        double result = tested.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forNineShouldReturnExpectedPerimeter() {
        //given
        double dimension = 9;
        double expResult = 36;

        //when
        Square tested = new Square(dimension, dimension);
        double result = tested.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }
}