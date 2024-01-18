package org.oop2;

public class Main {
    public static void main(String[] args) {

        Message window = new WindowMessage("This is class WindowMessage");
        Message console = new ConsoleMessage("This is class ConsoleMessage");

        System.out.println(window.getMessage());
        System.out.println(console.getMessage());
    }
}
