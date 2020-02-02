package com.thoughtworks.movierental;

import java.util.List;

public class HtmlStatement {
    protected final double totalAmount;
    protected final int totalFrequentRenterPoints;
    protected List<Rental> rentals;
    protected String customerName;

    public HtmlStatement(List<Rental> rentals, double totalAmount, int totalFrequentRenterPoints, String customerName) {
        this.rentals = rentals;
        this.totalAmount = totalAmount;
        this.totalFrequentRenterPoints = totalFrequentRenterPoints;
        this.customerName = customerName;
    }

    protected String header() {
        return "<h3>Rental Record for " + customerName+"</h3>"+"\n";
    }

    protected String body() {
        String result = "";
        for (Rental rental : rentals) {
            result += "\t" +rental.getMovie().getTitle()+ "\t" +
                    rental.calculateAmount()  + "\n";
        }
        return "<p>"+"\n"+result+"</p>"+"\n";
    }

    protected String footer() {
        String result = "";
        result +=  "<p>"+"Amount owed is " + totalAmount +"</p>"+ "\n";
        result += "<p>"+"You earned " + totalFrequentRenterPoints
                + " frequent renter points"+"</p>";
        return result;
    }

    public String generate() {
        return header() + body() + footer();
    }
}
