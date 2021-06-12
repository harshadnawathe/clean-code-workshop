package com.thoughtworks.movierental;

import java.util.ArrayList;

public class Rentals extends ArrayList<Rental> {

    public int totalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : this) {
            totalFrequentRenterPoints += rental.frequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    public double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : this) {
            double amount = rental.amount();
            totalAmount += amount;
        }
        return totalAmount;
    }
}
