package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class BluRayMovieTypeTest {
    @Test
    public void shouldReturnAmountForBluRayMovie() {
        BluRayMovieType bluRayMovieType = new BluRayMovieType(Movie.CHILDRENS);
        double amount = bluRayMovieType.amountFor(3);

        Assert.assertEquals(12.0, amount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForBluRayMovie() {
        BluRayMovieType bluRayMovieType = new BluRayMovieType(Movie.CHILDRENS);
        int frequentRenterPointsFor = bluRayMovieType.frequentRenterPointsFor(3);

        Assert.assertEquals(3, frequentRenterPointsFor, 0);
    }
}
