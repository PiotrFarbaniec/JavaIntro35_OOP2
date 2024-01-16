package org.oop2;

public class BigLetters implements TextFormatter {
    private static String text;

    public BigLetters (String text) {
        this.text = text;
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }

    static String formatToUpperCase (TextFormatter format) {
        return format.formatText(text);
    }
}
