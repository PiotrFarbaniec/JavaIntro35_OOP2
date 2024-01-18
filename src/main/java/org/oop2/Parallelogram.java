package org.oop2;

public class Parallelogram implements Quadrangles {

    private double base;
    private double side;
    private double high;

    public Parallelogram (double base, double side, double high) {
        this.base = base;
        this.side = side;
        this.high = high;
    }


    @Override
    public double getArea() {
        return base * high;
    }

    @Override
    public double getPerimeter() {
        return 2 * base + 2 * side;
    }
}
