package com.thoughtworks.movierental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        return new TextStatement(rentals, totalAmount(), totalFrequentRenterPoints(), name).generate();
    }

    private double totalAmount() {
        double totalAmount=0.0;
        for (Rental each : rentals) {

            totalAmount +=  each.calculateAmount();

        }
        return totalAmount;
    }

    private int totalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental each : rentals) {
            totalFrequentRenterPoints += each.frequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

}

