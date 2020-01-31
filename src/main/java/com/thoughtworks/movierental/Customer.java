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
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental Record for " + getName() + "\n";
        for (Rental each : rentals) {
            frequentRenterPoints++;
            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
                    &&
                    each.getDaysRented() > 1) frequentRenterPoints++;

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    each.calculateAmount() + "\n";
            totalAmount +=  each.calculateAmount();
        }

        //add footer lines result
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints
                + " frequent renter points";
        return result;
    }

}

