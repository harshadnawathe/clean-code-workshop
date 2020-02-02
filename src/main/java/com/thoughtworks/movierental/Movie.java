package com.thoughtworks.movierental;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;


    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }

    public boolean newRelease() {
        boolean release=false;
        if(getPriceCode() == NEW_RELEASE)
             release=true;
        return release;
    }


    public int frequentRenterPoints(int daysRented) {
        int frequentRenterPoints=1;
        // add bonus for a two day new release rental
        if (newRelease()
                &&
                daysRented > 1) frequentRenterPoints++;
        return frequentRenterPoints;
    }
}