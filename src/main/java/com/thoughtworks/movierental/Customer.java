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

        String result = header();
        result += body();
        result += footer();
        return result;
    }

    private String header() {
        return "Rental Record for " + getName() + "\n";
    }

    private String footer() {
        String result = "";
        result += "Amount owed is " + totalAmount() + "\n";
        result += "You earned " + totalFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }

    private double totalAmount() {
        double totalAmount=0.0;
        for (Rental each : rentals) {

            totalAmount +=  each.calculateAmount();

        }
        return totalAmount;
    }

    private String body() {
        String result = "";
        for (Rental each : rentals) {


            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    each.calculateAmount() + "\n";


        }
        return result;
    }

    private int totalFrequentRenterPoints() {
        int totalFrequentRenterPoints=0;
        for (Rental each : rentals) {
            totalFrequentRenterPoints = frequentRenterPoints(totalFrequentRenterPoints, each);
        }
        return totalFrequentRenterPoints;
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

