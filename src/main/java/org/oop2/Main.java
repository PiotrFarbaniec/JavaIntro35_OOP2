package org.oop2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(20);
        Shape square = new Square(9, 9);
        Shape rectangle = new Rectangle(8, 14);
        Shape triangle = new Triangle(12, 16, 20);
        Shape [] shapes = {circle, square, rectangle, triangle};

        for (Shape shape: shapes) {
            System.out.println(shape.getClassName() + " " + "area: " + shape.getArea()
                    + ", perimeter: " + shape.getPerimeter());

        }
    }
}
