import java.util.ArrayList;


public class GroceryList {
    private int[] myNumbers;
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGrocerylist() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for(int i =0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }
}
