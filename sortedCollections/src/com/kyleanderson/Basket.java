package com.kyleanderson;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Basket {
    private final String name;
    private final Map<StockItem, Integer> list;

    public Basket(String name) {
        this.name = name;
        this.list = new TreeMap<>();
    }

    public int addToBasket(StockItem item, int quantity) {
        if((item != null) && (quantity > 0)) {
            int inBasket = list.getOrDefault(item, 0);
            list.put(item, inBasket + quantity);
            return inBasket;
        }
        return 0;
    }

    public int removeFromBasket(StockItem item, int quantity) {
        if((item != null) && (quantity > 0)) {
            // check if we already have the item in the basket
            int inBasket = list.getOrDefault(item, 0);
            int newQuantity = inBasket + quantity;

            if(newQuantity > 0) {
                list.put(item, newQuantity);
                return quantity;
            } else if(newQuantity == 0) {
                list.remove(item);
            }
        }
        return 0;
    }

//    public String checkout(Basket basket) {
//        double checkoutCost = 0.0;
//        String m =  "\nChecking out the items from the " + name + " basket: ";
//        for(Map.Entry<StockItem, Integer> item: list.entrySet()) {
//            String itemList = "    " + item.getKey() + ", " + item.getValue() + " checking out in basket\n";
//            checkoutCost += item.getKey().getPrice() * item.getValue();
//
//
//        }
//        String separator = "\n*********";
//        String t = "\nYour total basket cost is " + checkoutCost;
//        System.out.println(separator + m + t + separator);
//        return m + t + checkoutCost;
//    }

    public Map<StockItem, Integer> Items() {
        return Collections.unmodifiableMap(list);
    }


    @Override
    public String toString() {
        String s = "\nShopping basket " + name + " contains " + list.size() + ((list.size() == 1) ?  " item:" : " items:") +  "\n";
        double totalCost = 0.0;
        for(Map.Entry<StockItem, Integer> item: list.entrySet()) {
            s = s + "    " + item.getKey() + ", " + item.getValue() + " reserved in basket\n";
            totalCost += item.getKey().getPrice() * item.getValue();
        }
        return s + "    ********" + "\n" + "    Total Cost " + totalCost;
    }
}
