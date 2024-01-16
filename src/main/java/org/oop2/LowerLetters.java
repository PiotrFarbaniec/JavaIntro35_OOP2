package org.oop2;

public class LowerLetters implements TextFormatter {
    private static String text;


    public LowerLetters(String text) {
        this.text = text;
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }

    static String formatToLowerCase (TextFormatter format) {
        return format.formatText(text);
    }
}
