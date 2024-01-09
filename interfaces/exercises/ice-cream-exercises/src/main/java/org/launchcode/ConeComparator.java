package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone cone1, Cone cone2) {
        // Return a positive integer if cone1 is more expensive.
        // Return 0 if both cones have the same cost.
        return Double.compare(cone1.getCost(), cone2.getCost()); // Return a negative integer if cone1 is cheaper.
    }
}