package org.OOP2;

public abstract class Message {
protected String message;

public Message(String message) {
    this.message = message;
}
    public abstract String getMessage();
}
