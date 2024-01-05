package org.launchcode;
import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {
    @Override
    public int compare(Topping topping1, Topping topping2) {
        int allergenCount1 = topping1.getAllergens().size();
        int allergenCount2 = topping2.getAllergens().size();

        // Sort in ascending order (from lowest to highest allergen count)
        return Integer.compare(allergenCount1, allergenCount2);
    }
}