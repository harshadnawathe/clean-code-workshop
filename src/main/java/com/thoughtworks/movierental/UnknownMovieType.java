package com.thoughtworks.movierental;

public class UnknownMovieType implements MovieType{
    private int priceCode;

    public UnknownMovieType(int priceCode) {

        this.priceCode = priceCode;
    }

    public double amountFor(int daysRented) {
        return 0;
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
