package org.OOP2;

public class WindowMessage extends Message {

    public WindowMessage(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
