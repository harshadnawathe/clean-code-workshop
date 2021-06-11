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
        String result = "Rental Record for " + name + "\n";

        for (Rental rental : rentals) {
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "\n";

        }

        //add footer lines result
        result += "Amount owed is " + totalAmount() + "\n";
        result += "You earned " + totalFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        String result = "<h3>Rental Record for " + getName() + "</h3><br/>";
        result += "<p>";

        for (Rental rental : rentals) {
            //show figures for this rental
            result += rental.getMovie().getTitle() + ": <b>" +
                    rental.amount() + "</b><br/>";
        }

        result += "</p>";
        //add footer lines result
        result += "<p>Amount owed is <b>" + totalAmount() + "</b></p>";
        result += "<p>You earned <b>" + totalFrequentRenterPoints()
                + "</b> frequent renter points</p>";
        return result;
    }

    private int totalFrequentRenterPoints() {
        int totalFrequentRenterPoints = 0;
        for (Rental rental : rentals) {
            totalFrequentRenterPoints += rental.frequentRenterPoints();
        }
        return totalFrequentRenterPoints;
    }

    private double totalAmount() {
        double totalAmount = 0;
        for (Rental rental : rentals) {
            double amount = rental.amount();
            totalAmount += amount;
        }
        return totalAmount;
    }

}

