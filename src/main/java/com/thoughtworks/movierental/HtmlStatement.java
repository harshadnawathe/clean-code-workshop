package com.thoughtworks.movierental;

class HtmlStatement {
    private final Rentals rentals;
    private final String customerName;

    public HtmlStatement(String customerName, Rentals rentals) {
        this.rentals = rentals;
        this.customerName = customerName;
    }

    public String html() {
        String result = "<h3>Rental Record for " + customerName + "</h3><br/>";
        result += "<p>";

        for (Rental rental : rentals) {
            //show figures for this rental
            result += rental.getMovie().getTitle() + ": <b>" +
                    rental.amount() + "</b><br/>";
        }

        result += "</p>";
        //add footer lines result
        result += "<p>Amount owed is <b>" + rentals.totalAmount() + "</b></p>";
        result += "<p>You earned <b>" + rentals.totalFrequentRenterPoints()
                + "</b> frequent renter points</p>";
        return result;
    }
}
