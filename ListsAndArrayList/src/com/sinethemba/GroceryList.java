package com.sinethemba;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item){

        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " item in the grocery list.");
        System.out.println("\n This is our grocery list: ");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println((i +1) + ". " + groceryList.get(i) );
        }
    }

    private void updateGroceryItem(int position, String newItem){

        groceryList.set(position, newItem);
        System.out.println("\n Grocery item number " + (position+1) + " have been updated");
    }

    public void updateGroceryItem(String currentItem, String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            updateGroceryItem(position, newItem);
        }
    }

    private void removeGroceryItem(int postion){
        groceryList.remove(postion);
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if (position >= 0){
            removeGroceryItem(position);
        }
    }

    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }

}
