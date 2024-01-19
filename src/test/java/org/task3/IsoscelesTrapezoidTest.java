package org.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class IsoscelesTrapezoidTest {

    @Test
    void forThreeAndHalfEightAndThreeShouldReturnExpectedAreaValue() {
        //given
        double dimA = 3.5;
        double dimB = 8;
        double high = 3.0;
        double expResult = 17.25;

        //when
        IsoscelesTrapezoid trapeze = new IsoscelesTrapezoid(dimA, dimB, high);
        double result = trapeze.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forSevenSixteenAndSixShouldReturnExpectedAreaValue() {
        //given
        double dimA = 7;
        double dimB = 16;
        double high = 6;
        double expResult = 69;

        //when
        IsoscelesTrapezoid trapeze = new IsoscelesTrapezoid(dimA, dimB, high);
        double result = trapeze.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forThreeAndHalfEightAndThreeShouldReturnExpectedPerimeterValue() {
        //given
        double dimA = 3.5;
        double dimB = 8;
        double high = 3.0;
        double expResult = 19.0;

        //when
        IsoscelesTrapezoid trapeze = new IsoscelesTrapezoid(dimA, dimB, high);
        double result = trapeze.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forSevenSixteenAndSixShouldReturnExpectedPerimeterValue() {
        //given
        double dimA = 7;
        double dimB = 16;
        double high = 6;
        double expResult = 38;

        //when
        IsoscelesTrapezoid trapeze = new IsoscelesTrapezoid(dimA, dimB, high);
        double result = trapeze.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }
}