package com.kyleanderson;

import java.util.ArrayList;
import java.util.LinkedList;

public abstract class ListItem {
    private String itemName;

    public ListItem(String itemName) {
        this.itemName = itemName;
        LinkedList<String> items = new LinkedList<String>();
    }

    public abstract void nextItem();

    public abstract void previousItem();

    public abstract void setNextItem();

    public abstract void setPreviousItem();

    public int compareTo(String input) {

    }


}
