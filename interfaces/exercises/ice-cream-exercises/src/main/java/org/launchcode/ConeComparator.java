package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone cone1, Cone cone2) {
        if (cone1.getCost() < cone2.getCost()) {
            return -1; // Return a negative integer if cone1 is cheaper.
        } else if (cone1.getCost() > cone2.getCost()) {
            return 1; // Return a positive integer if cone1 is more expensive.
        } else {
            return 0; // Return 0 if both cones have the same cost.
        }
    }
}