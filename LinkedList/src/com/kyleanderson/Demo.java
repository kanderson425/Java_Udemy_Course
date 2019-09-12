package com.kyleanderson;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());

        }
        System.out.println("=======================");
    }
}
