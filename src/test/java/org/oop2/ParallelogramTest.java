package org.oop2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ParallelogramTest {

    @Test
    void forNineSixAndFourShouldReturnExpectedAreaResult() {
        //given
        double base = 9.0;
        double side = 6.0;
        double high = 4.0;
        double expResult = 36.0;

        //when
        Quadrangles parallelogram = new Parallelogram(base, side, high);
        double result = parallelogram.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forTwelveSevenAdnEightShouldReturnExpectedAreaResult() {
        //given
        double base = 12.0;
        double side = 7.0;
        double high = 8.0;
        double expResult = 96.0;

        //when
        Quadrangles parallelogram = new Parallelogram(base, side, high);
        double result = parallelogram.getArea();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forNineSixAndFourShouldReturnExpectedPerimeterResult() {
        //given
        double base = 9.0;
        double side = 6.0;
        double high = 4.0;
        double expResult = 30.0;

        //when
        Quadrangles parallelogram = new Parallelogram(base, side, high);
        double result = parallelogram.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }

    @Test
    void forTwelveSevenAdnEightShouldReturnExpectedPerimeterResult() {
        //given
        double base = 12.0;
        double side = 7.0;
        double high = 8.0;
        double expResult = 38.0;

        //when
        Quadrangles parallelogram = new Parallelogram(base, side, high);
        double result = parallelogram.getPerimeter();

        //then
        Assertions.assertEquals(expResult, result);
    }
}