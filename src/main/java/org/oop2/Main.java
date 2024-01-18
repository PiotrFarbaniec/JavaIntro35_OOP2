package org.oop2;

public class Main {
    public static void main(String[] args) {
        String text = "Some Sample Text To Format";
        TextFormatter firstImpl = new BigLetters();
        System.out.println(firstImpl.formatText(text));

        LowLetters secondImpl = new LowLetters();
        System.out.println(secondImpl.formatText(text));
    }
}
