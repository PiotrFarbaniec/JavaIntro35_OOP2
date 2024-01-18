package org.oop2;

public class Square extends Shape {

    private double dim;
    public Square(double dim) {
        super();
        this.dim = dim;
    }

    @Override
    public double getArea() {
        return dim * dim;
    }

    @Override
    public double getPerimeter() {
        return 4 * dim;
    }
}
