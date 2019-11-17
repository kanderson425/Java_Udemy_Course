package com.kyleanderson;

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
        System.out.println(kylesBasket);

        sellItem(kylesBasket, "juice", 4);
        sellItem(kylesBasket, "cup", 12);
        sellItem(kylesBasket, "bread", 1);
        System.out.println(kylesBasket);

        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("car").adjustStock(2000);
        stockList.Items().get("car").adjustStock(-1000);
        System.out.println(stockList);


    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from the stockList first
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.sellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
