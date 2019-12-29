package com.kyleanderson;

public class IndexRecord {
    private int startByte;
    private int length;

    public IndexRecord(int startByte, int length) {
        this.startByte = startByte;
        this.length = length;
    }

    public int getStartByte() {
        return startByte;
    }

    public int getLength() {
        return length;
    }

    public void setStartByte(int startByte) {
        this.startByte = startByte;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
