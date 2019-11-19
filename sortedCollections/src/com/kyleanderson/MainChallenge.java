package com.kyleanderson;

public class MainChallenge {
    private static StockList  challengeStockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        challengeStockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        challengeStockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        challengeStockList.addStock(temp);

        System.out.println(challengeStockList);
        System.out.println("*************************");

        Basket challengeBasket = new Basket("Challenge");
        reserveItem(challengeBasket, "bread", 10);
        reserveItem(challengeBasket, "car", 1);

        System.out.println(challengeBasket);
        checkoutBasket(challengeBasket);
    }


    public static int reserveItem(Basket basket, String item, int quantity) {
        // retrieve the item from the stockList first
        StockItem stockItem = challengeStockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(challengeStockList.reserveSellStock(item, quantity) != 0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }


    public static void checkoutBasket(Basket basket) {

        basket.checkout(basket);
    }
}
