package org.oop2;

public abstract class Shape {
    protected double dimA;
    protected double dimB;
    protected final double PI = 3.14159;

    public Shape () {
    }

    public Shape(double dimA, double dimB) {
        this.dimA = dimA;
        this.dimB = dimB;
    }

    public abstract double getArea();
    public abstract double getPerimeter();


    protected String getClassName(){
        Object obj = this;
        Class cls = obj.getClass();
        String className = cls.getName();
        String [] classNameParts = className.split("\\.");
        String simpleName = classNameParts[classNameParts.length-1];
        return simpleName;
    }
}
