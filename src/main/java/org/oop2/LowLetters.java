package org.oop2;

public class LowLetters implements TextFormatter {

    public LowLetters() {
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
