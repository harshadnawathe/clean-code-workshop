package com.thoughtworks.movierental;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int BLU_RAY = 3;

    private String title;
    private MovieType movieType;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.movieType = movieTypeFrom(priceCode);
    }

    public Movie(String title, MovieType movieType) {
        this.title = title;
        this.movieType = movieType;
    }

    public int getPriceCode() {
        return movieType.priceCode();
    }

    public void setPriceCode(int arg) {
        movieType = movieTypeFrom(arg);
    }

    public String getTitle() {
        return title;
    }

    double amountFor(int daysRented) {
        return movieType.amountFor(daysRented);
    }

    int frequentRenterPointsFor(int daysRented) {
        return movieType.frequentRenterPointsFor(daysRented);
    }

    private MovieType movieTypeFrom(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                return new RegularMovieType(priceCode);
            case NEW_RELEASE:
                return new NewReleaseMovieType(priceCode);
            case CHILDRENS:
                return new ChildrenMovieType(priceCode);
            case BLU_RAY:
                return new BluRayMovieType(priceCode);
            default:
                return new UnknownMovieType(priceCode);
        }
    }
}