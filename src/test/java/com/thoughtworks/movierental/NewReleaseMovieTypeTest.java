package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class NewReleaseMovieTypeTest {
    @Test
    public void shouldReturnAmountForNewReleaseMovie() {
        NewReleaseMovieType newReleaseMovieType = new NewReleaseMovieType(Movie.CHILDRENS);
        double amount = newReleaseMovieType.amountFor(3);

        Assert.assertEquals(9.0, amount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForNewReleaseMovie() {
        NewReleaseMovieType newReleaseMovieType = new NewReleaseMovieType(Movie.CHILDRENS);
        int frequentRenterPointsFor = newReleaseMovieType.frequentRenterPointsFor(3);

        Assert.assertEquals(2, frequentRenterPointsFor, 0);
    }
}