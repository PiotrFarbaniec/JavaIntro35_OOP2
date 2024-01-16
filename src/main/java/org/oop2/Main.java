package org.oop2;

public class Main {
    public static void main(String[] args) {

        TextFormatter firstImpl = new BigLetters("Some Sample Text To Format");
        System.out.println(BigLetters.formatToUpperCase(firstImpl));

        LowerLetters secondImpl = new LowerLetters("Some Sample Text To Format");
        System.out.println(LowerLetters.formatToLowerCase(secondImpl));
    }
}