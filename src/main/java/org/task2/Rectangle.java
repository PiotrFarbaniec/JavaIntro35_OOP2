package org.task2;

public class Rectangle extends Shape {

    public Rectangle(double dimA, double dimB) {
        super(dimA, dimB);
    }

    @Override
    public double getArea() {
        return dimA * dimB;
    }

    @Override
    public double getPerimeter() {
        return 2 * (dimA + dimB);
    }
}
