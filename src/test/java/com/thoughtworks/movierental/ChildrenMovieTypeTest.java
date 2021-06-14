package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class ChildrenMovieTypeTest {
    @Test
    public void shouldReturnAmountForChildrenMovie() {
        ChildrenMovieType childrenMovieType = new ChildrenMovieType(Movie.CHILDRENS);
        double amount = childrenMovieType.amountFor(3);

        Assert.assertEquals(1.5, amount, 0.0);
    }

    @Test
    public void shouldReturnFrequentRenterPointsForChildrenMovie() {
        ChildrenMovieType childrenMovieType = new ChildrenMovieType(Movie.CHILDRENS);
        int frequentRenterPointsFor = childrenMovieType.frequentRenterPointsFor(3);

        Assert.assertEquals(1, frequentRenterPointsFor, 0);
    }
}