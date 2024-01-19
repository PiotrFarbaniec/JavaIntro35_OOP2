package org.task4;

public class LowLetters implements TextFormatter {

    public LowLetters() {
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}
