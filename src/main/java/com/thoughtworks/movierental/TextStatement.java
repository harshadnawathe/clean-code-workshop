package com.thoughtworks.movierental;

import java.util.List;

class TextStatement {
    private List<Rental> rentals;
    private final double totalAmount;
    private final int totalFrequentRenterPoints;
    private String customerName;

    public TextStatement(List<Rental> rentals, double totalAmount
            , int totalFrequentRenterPoints, String customerName) {
        this.rentals = rentals;
        this.totalAmount = totalAmount;
        this.totalFrequentRenterPoints = totalFrequentRenterPoints;
        this.customerName = customerName;
    }

    public String generate() {
        return header()+body()+footer();
    }

    private String header() {
        return "Rental Record for " + customerName + "\n";
    }

    private String body() {
        String result = "";
        for (Rental rental : rentals) {
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.calculateAmount() + "\n";
        }
        return result;
    }

    private String footer() {
        String result = "";
        result += "Amount owed is " + totalAmount + "\n";
        result += "You earned " + totalFrequentRenterPoints
                + " frequent renter points";
        return result;
    }
}
