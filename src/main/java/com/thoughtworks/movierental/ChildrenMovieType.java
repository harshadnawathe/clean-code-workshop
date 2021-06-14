package com.thoughtworks.movierental;

public class ChildrenMovieType implements MovieType{
    private int priceCode;

    public ChildrenMovieType(int priceCode) {

        this.priceCode = priceCode;
    }

    public double amountFor(int daysRented) {
        double amount;
        amount = 1.5;
        if (daysRented > 3)
            amount += (daysRented - 3) * 1.5;
        return amount;
    }

    public int frequentRenterPointsFor(int daysRented) {
        return 1;
    }

    @Override
    public int priceCode() {
        return priceCode;
    }
}
