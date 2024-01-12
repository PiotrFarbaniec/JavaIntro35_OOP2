package org.OOP2;

public class ConsoleMessage extends Message {

    public ConsoleMessage(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
