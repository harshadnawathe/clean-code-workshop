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

        String result = "Rental Record for " + getName() + "\n";
        double totalAmount = 0;
        int totalFrequentRenterPoints = 0;
        for (Rental each : rentals) {
            totalFrequentRenterPoints = frequentRenterPoints(totalFrequentRenterPoints, each);

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    each.calculateAmount() + "\n";
            totalAmount +=  each.calculateAmount();
        }

        //add footer lines result
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + totalFrequentRenterPoints
                + " frequent renter points";
        return result;
    }

    private int frequentRenterPoints(int frequentRenterPoints, Rental each) {
        frequentRenterPoints++;
        // add bonus for a two day new release rental
        if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                &&
                each.getDaysRented() > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }

}

