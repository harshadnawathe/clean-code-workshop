package com.thoughtworks.movierental;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RentalTest {
    @Test
    public void shouldReturnAmountForChildrenMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 3);

        double actualAmount = rental.amount();

        Assert.assertEquals(1.5, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnAmountForRegularMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.REGULAR), 3);

        double actualAmount = rental.amount();

        Assert.assertEquals(3.5, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnAmountForNewReleaseMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.NEW_RELEASE), 3);

        double actualAmount = rental.amount();

        Assert.assertEquals(9.0, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnAmountForUnknownMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", 8), 3);

        double actualAmount = rental.amount();

        Assert.assertEquals(0.0, actualAmount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForChildrenMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.CHILDRENS), 3);

        int frequentRenterPoints = rental.frequentRenterPoints();

        Assert.assertEquals(1, frequentRenterPoints, 0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForRegularMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.REGULAR), 3);

        int frequentRenterPoints = rental.frequentRenterPoints();

        Assert.assertEquals(1, frequentRenterPoints, 0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForNewReleaseMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", Movie.NEW_RELEASE), 3);

        int frequentRenterPoints = rental.frequentRenterPoints();

        Assert.assertEquals(2, frequentRenterPoints, 0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForUnknownMovie() {
        Rental rental = new Rental(new Movie("Harry Potter", 8), 3);

        int frequentRenterPoints = rental.frequentRenterPoints();

        Assert.assertEquals(1, frequentRenterPoints, 0);
    }
}