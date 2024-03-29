package org.task9;

public class Triangle {

    private double width;
    private double height;

    public Triangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle {width=<" + this.width + '>' + ", height=<" + this.height + ">}";
    }
}
