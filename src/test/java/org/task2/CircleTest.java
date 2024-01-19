package org.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CircleTest {

    @Test
    void forTenShouldReturnExpectedArea() {
        //given
        double radius = 10;
        double expResult = 314.159;

        //when
        Circle tested = new Circle(radius);
        double result = tested.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forTwentyShouldReturnExpectedArea() {
        //given
        double radius = 20;
        double expResult = 1256.636;

        //when
        Circle tested = new Circle(radius);
        double result = tested.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forTenShouldReturnExpectedPerimeter() {
        //given
        double radius = 10;
        double expResult = 62.8318;

        //when
        Circle tested = new Circle(radius);
        double result = tested.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forTwentyShouldReturnExpectedPerimeter() {
        //given
        double radius = 20;
        double expResult = 125.6636;

        //when
        Circle tested = new Circle(radius);
        double result = tested.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }
}