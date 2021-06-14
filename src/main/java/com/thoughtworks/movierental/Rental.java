package com.thoughtworks.movierental;

public class Rental {

    private int daysRented;
    private Movie movie;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double amount() {
        return movie.amountFor(this.daysRented);
    }

    int frequentRenterPoints() {
        return movie.frequentRenterPointsFor(this.daysRented);
    }

}