package com.thoughtworks.movierental;

class TextStatement {
    private final String customerName;
    private final Rentals rentals;

    TextStatement(String customerName, Rentals rentals) {
        this.customerName = customerName;
        this.rentals = rentals;
    }

    public String text() {
        String result = "Rental Record for " + customerName + "\n";

        for (Rental rental : rentals) {
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" +
                    rental.amount() + "\n";

        }

        //add footer lines result
        result += "Amount owed is " + rentals.totalAmount() + "\n";
        result += "You earned " + rentals.totalFrequentRenterPoints()
                + " frequent renter points";
        return result;
    }
}
