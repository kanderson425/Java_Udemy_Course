package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.tranverse(list.getRoot());
    // Create a string data array to avoid multiple loads of addItem instructions:
	String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canverra";


	String[] data = stringData.split(" ");
	for(String s : data) {
	    list.addItem(new Node(s));
    }

	list.tranverse(list.getRoot());
    }
}
