package org.oop2;

public class BigLetters implements TextFormatter {

    public BigLetters () {
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
