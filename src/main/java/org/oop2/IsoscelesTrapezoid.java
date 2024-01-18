package org.oop2;

public class IsoscelesTrapezoid implements Quadrangles{

    private double dimA;
    private double dimB;
    private double high;

    private double dimC;

    public IsoscelesTrapezoid(double dimA, double dimB, double high) {
        this.dimA = dimA;
        this.dimB = dimB;
        this.high = high;
    }

    @Override
    public double getArea() {
        return 0.5 * (dimA + dimB) * high;
    }

    @Override
    public double getPerimeter() {
        double delta = (dimB > dimA) ? (dimB - dimA) : (dimA - dimB);
        this.dimC = Math.sqrt(high * high + (0.5 * delta) * (0.5 * delta));
        return dimA + dimB + 2 * dimC;
    }
}
