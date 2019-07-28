package com.kyleanderson;

public class Printer {

    private int tonerLevelPercent = 100;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevelPercent, int pagesPrinted, boolean duplexPrinter) {
        this.tonerLevelPercent = tonerLevelPercent;
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
        System.out.println("The current printer toner level is at " + tonerLevelPercent + " percent.");
        System.out.println("You have printed out " + pagesPrinted + " pages.");
        if(duplexPrinter) {
            System.out.println("This printer can print double sided.");
        } else {
            System.out.println("This printer can NOT print double sided.");
        }

    }

    public void fillUpToner() {
        tonerLevelPercent = 100;
        System.out.println("Filled up toner. The toner level is now set to " + tonerLevelPercent + " percent.");

    }

    public void printPage() {
        System.out.println("Printing page.");
        int newPagesPrinted = pagesPrinted + 1;
        pagesPrinted = newPagesPrinted;
        System.out.println("You have printed out " + pagesPrinted + " pages.");
    }
}
