package org.launchcode;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        Topping topping1 = new Topping("Chocolate Chips", 0.75, new ArrayList<>());
        Topping topping2 = new Topping("Sprinkles", 0.50, new ArrayList<>());
        Topping topping3 = new Topping("Caramel Drizzle", 1.00, new ArrayList<>());
        menu.addTopping(topping1);
        menu.addTopping(topping2);
        menu.addTopping(topping3);

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
        flavors.sort(new FlavorComparator());
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
        cones.sort(new ConeComparator());
        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
        System.out.println("\nFlavors:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }
        System.out.println("\nCones:");
        for (Cone cone : cones) {
            String formattedCost = String.format("%.2f", cone.getCost());
            System.out.println(cone.getName() + ": $" + formattedCost);
        }
        ArrayList<Topping> toppings = menu.getToppings();
        toppings.sort(new ToppingComparator());

        System.out.println("\nToppings:");
        for (Topping topping : toppings) {
            String formattedCost = String.format("%.2f", topping.getCost());
            System.out.println(topping.getName() + ": $" + formattedCost + " (Allergen Count: " + topping.getAllergens().size() + ")");
        }
    }
}