package com.thoughtworks.movierental;

public class RegularMovieType implements MovieType {
    private int priceCode;

    public RegularMovieType(int priceCode) {

        this.priceCode = priceCode;
    }

    @Override
    public double amountFor(int daysRented) {
        double amount;
        amount = 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        return 1;
    }

    @Override
    public int priceCode() {
        return priceCode;
    }
}
