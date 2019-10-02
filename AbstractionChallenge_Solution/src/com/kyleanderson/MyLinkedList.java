package com.kyleanderson;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void tranverse(ListItem item) {

    }
}
