package org.launchcode;
import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        int allergenCount1 = flavor1.getAllergens().size();
        int allergenCount2 = flavor2.getAllergens().size();

        // Sort in descending order (highest to lowest allergen count)
        return Integer.compare(allergenCount2, allergenCount1);
    }
}