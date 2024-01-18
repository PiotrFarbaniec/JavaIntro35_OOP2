package org.oop2;

public class Animal {

    private String name;

    protected Animal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
