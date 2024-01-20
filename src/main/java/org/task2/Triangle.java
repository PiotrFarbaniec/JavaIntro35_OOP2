package org.task2;

public class Triangle extends Shape {

    private double s;
    private double dimC;

    public Triangle(double dimA, double dimB, double dimC) {
        super(dimA, dimB);
        this.dimC = dimC;
    }

    @Override
    public double getArea() {
        s = getPerimeter() / 2;
        return Math.sqrt(s * (s - dimA) * (s - dimB) * (s - dimC));
    }

    @Override
    public double getPerimeter() {
        return dimA + dimB + dimC;
    }
}
