package com.thoughtworks.movierental;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RegularMovieTypeTest {
    @Test
    public void shouldReturnAmountForRegularMovie() {
        RegularMovieType childrenMovieType = new RegularMovieType(Movie.REGULAR);
        double amount = childrenMovieType.amountFor(3);

        Assert.assertEquals(3.5, amount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForRegularMovie() {
        RegularMovieType regularMovieType = new RegularMovieType(Movie.CHILDRENS);
        int frequentRenterPointsFor = regularMovieType.frequentRenterPointsFor(3);

        Assert.assertEquals(1, frequentRenterPointsFor, 0);
    }
}