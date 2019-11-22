package com.kyleanderson;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 100);
        stockList.addStock(temp);

        temp = new StockItem("cup", .50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);


        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.500, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone",96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket kylesBasket = new Basket("Kyle");

        sellItem(kylesBasket, "car", 1);
        System.out.println(kylesBasket);

        sellItem(kylesBasket, "car", 1);
        System.out.println(kylesBasket);

        sellItem(kylesBasket, "car", 1);
        System.out.println(kylesBasket);

        if(sellItem(kylesBasket,"car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }
        sellItem(kylesBasket, "spanner", 5);
//        System.out.println(kylesBasket);

        sellItem(kylesBasket, "juice", 4);
        sellItem(kylesBasket, "cup", 12);
        sellItem(kylesBasket, "bread", 1);
//        System.out.println(kylesBasket);

        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        StockItem car = stockList.Items().get("car");
        if(car != null) {
            car.adjustStock(2000);
        }
        if(car != null) {
            stockList.get("car").adjustStock(-10000);
        }

        System.out.println(stockList);
        for(Map.Entry<String, Double> prices: stockList.PriceList().entrySet()) {
            System.out.println(prices.getKey() + " costs " + prices.getValue());
        }

        Basket basket = new Basket("customer");
        sellItem(basket, "cup", 100);
        sellItem(basket, "juice", 5);
        removeItem(basket, "cup", 1);
        System.out.println(basket);
        checkout(basket);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from the stockList first
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve the item from the stockList first
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkout(Basket basket) {
        for(Map.Entry<StockItem, Integer> item: basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
