package com.kyleanderson;

public class Printer {

    private int tonerLevelPercent = 100;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevelPercent, int pagesPrinted, boolean duplexPrinter) {
        this.tonerLevelPercent = tonerLevelPercent;
        this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillUpToner() {
        tonerLevelPercent = 100;

    }

    public int printPage() {
        int newPagesPrinted = pagesPrinted + 1;
        pagesPrinted = newPagesPrinted;
        return pagesPrinted;
    }
}
