package org.oop2;

public class Main {
    public static void main(String[] args) {

        Quadrangles trapeze = new IsoscelesTrapezoid(7, 16, 6);
        System.out.println(trapeze.getArea());
        System.out.println(trapeze.getPerimeter());

        Quadrangles parallelogram = new Parallelogram(12, 7, 8);
        System.out.println(parallelogram.getArea());
        System.out.println(parallelogram.getPerimeter());
    }
}
