package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());
    // Create a string data array to avoid multiple loads of addItem instructions:
	String stringData = "5 7 3 9 8 2 1 0 4 6";


	String[] data = stringData.split(" ");
	for(String s : data) {
	    list.addItem(new Node(s));
    }

	list.traverse(list.getRoot());
	list.removeItem(new Node("3"));
	list.traverse(list.getRoot());

	list.removeItem(new Node("5"));
	list.traverse(list.getRoot());


	//As of right now, the list.getRoot() method only works on printing the list of numbers on the first call of the method. Does not work on any other call of the method
    }
}
