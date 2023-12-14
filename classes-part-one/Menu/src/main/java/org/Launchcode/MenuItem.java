package org.Launchcode;

import java.util.Date;

public class MenuItem {
    private String category;
    private String name;
    private String description;
    private double price = 0.0;
    private final Date dateAdded;
    private boolean isNew;

    public MenuItem(String category, String name, String description, double price) { //struct
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.dateAdded = new Date();
        this.isNew = false;
    }

    public String printItem(){ //print method that includes New item print case
        String pricePrint = Double.toString(this.price);
        if(this.isNew){
            return ("NEW! " + this.name + ": " + this.description + "   $" + pricePrint);
        } else return (this.name + ": " + this.description + "   $" + pricePrint);

    }




//gets and sets


    public String getCategory(){
        return category;
    }
    public void setCategory(String aCategory){
        this.category = aCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getName(){
        return name;
    }


    public Date getDateAdded(){
        return this.dateAdded;
    }


    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}