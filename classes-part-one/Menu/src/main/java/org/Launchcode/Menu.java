package org.Launchcode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;


public class Menu {
    //elements, restName and array of menuitems
    private String restaurantName;
    private ArrayList<MenuItem> theMenu = new ArrayList<MenuItem>();
    private Date dateModified;
    //basic constructor with restaurant name
    public Menu(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public Menu(String restaurantName, ArrayList<MenuItem> theMenu){
        this.restaurantName = restaurantName;
        this.theMenu = theMenu;
    }
    //methods for getting sorting and printing menu
    public ArrayList<MenuItem> getTheMenu() {
        return theMenu;
    }

    public void loadMenu(ArrayList<MenuItem> theMenu){
        this.theMenu = theMenu;
    }

    public ArrayList<MenuItem> sortMenu(ArrayList<MenuItem> unsortedMenu){
        setNewItems(unsortedMenu);
        unsortedMenu.sort(Comparator.comparing(MenuItem::getCategory));
        return unsortedMenu;
    }

    public void setNewItems(ArrayList<MenuItem> unsortedMenu){
        unsortedMenu.sort(Comparator.comparing(MenuItem::getDateAdded));
        for(int i=0 ; i < 4; i++ ){
            unsortedMenu.get(i).setNew(true);
        }
        for (int i=4 ; i< unsortedMenu.size(); i++ ){
            unsortedMenu.get(i).setNew(false);
        }
    }


    public void printMenu(ArrayList<MenuItem> aMenu){
        int i=0;
        aMenu = sortMenu(aMenu);
        System.out.println("================================= " + this.getRestaurantName() + " =====================================");
        System.out.println("================================= " + aMenu.get(i).getCategory().toUpperCase() + "S =====================================");
        for( i = 0 ; i< aMenu.size(); i++ ){
            System.out.println(aMenu.get(i).printItem());
            if(i+1 == aMenu.size()){
                System.out.println("=============================Gratuity automatically added, no exceptions for allergies============================");
            } else if(aMenu.get(i).getCategory().compareTo(aMenu.get(i+1).getCategory()) != 0){
                System.out.println("================================= " + aMenu.get(i+1).getCategory().toUpperCase() + "S =====================================");
            }


        }
        System.out.println("================================= Date Modified: " + this.dateModified + " =====================================");
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public ArrayList<MenuItem> addMenuItem(MenuItem newAddition){
        theMenu.add(newAddition);
        this.dateModified = new Date();
        return theMenu;
    }

    public void removeItemByName (String itemName){
        for(MenuItem e : theMenu) {
            if (e.getName().equalsIgnoreCase(itemName)) {
                theMenu.remove(e);
            }
        }
    }
}
