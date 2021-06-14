package com.thoughtworks.movierental;

public interface MovieType {
    double amountFor(int daysRented);
    int frequentRenterPointsFor(int daysRented);
    int priceCode();
}
