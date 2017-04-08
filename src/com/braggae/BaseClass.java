package com.braggae;

public abstract class BaseClass {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    protected void error(String text) {
        this.printLnColour(text, ANSI_RED);
    }

    protected void success(String text) {
        this.printLnColour(text, ANSI_GREEN);
    }

    protected void printRed(String text) {
        this.printColour(text, ANSI_RED);
    }

    protected void printGreen(String text) {
        this.printColour(text, ANSI_GREEN);
    }

    protected void printLnColour(String text, String colour) {
        this.println(colour + text + ANSI_RESET);
    }

    protected void printColour(String text, String colour) {
        this.print(colour + text + ANSI_RESET);
    }

    protected void print(String text){
        System.out.print(text);
    }

    protected void println(String text){
        System.out.println(text);
    }
}
