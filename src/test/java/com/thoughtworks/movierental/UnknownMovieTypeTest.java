package com.thoughtworks.movierental;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class UnknownMovieTypeTest {
    @Test
    public void shouldReturnAmountForUnknownnMovie() {
        UnknownMovieType unknownMovieType = new UnknownMovieType(8);
        double amount = unknownMovieType.amountFor(3);

        Assert.assertEquals(0.0, amount, 0.0);
    }
}