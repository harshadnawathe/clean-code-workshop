package com.thoughtworks.movierental;

public class BluRayMovieType implements MovieType{
    private int priceCode;

    public BluRayMovieType(int priceCode) {

        this.priceCode = priceCode;
    }

    @Override
    public double amountFor(int daysRented) {
        return daysRented * 4;
    }

    @Override
    public int frequentRenterPointsFor(int daysRented) {
        return 3;
    }

    @Override
    public int priceCode() {
        return priceCode;
    }
}
