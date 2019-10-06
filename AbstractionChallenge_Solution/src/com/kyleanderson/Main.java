package com.kyleanderson;

public class Main {

    public static void main(String[] args) {

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());
    // Create a string data array to avoid multiple loads of addItem instructions:
	String stringData = "5 7 3 9 8 2 1 0 4 6";


	String[] data = stringData.split(" ");
	for(String s : data) {
	    tree.addItem(new Node(s));
    }


	tree.traverse(tree.getRoot());
	tree.removeItem(new Node("3"));
	tree.traverse(tree.getRoot());

	tree.removeItem(new Node("5"));
	tree.traverse(tree.getRoot());


    }
}
