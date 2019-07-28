package com.kyleanderson;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if(tonerLevel >= 1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplexPrinter = duplexPrinter;
        this.pagesPrinted = 0;

    }

    public int addToner(int tonerAmount) {
        if(tonerLevel > 0 && tonerAmount <= 100) {
            if(this.tonerLevel + tonerAmount > 100) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public void printPage() {
        System.out.println("Printing page.");
        int newPagesPrinted = pagesPrinted + 1;
        pagesPrinted = newPagesPrinted;
        int tonerLevel = tonerLevelPercent - 10;
        tonerLevelPercent = tonerLevel;
        System.out.println("You have printed out " + pagesPrinted + " pages.");
        System.out.println("Toner level is now at " + tonerLevelPercent + " percent.");
    }
}
