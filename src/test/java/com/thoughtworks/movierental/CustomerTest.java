package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void test() {
         Customer customer=new Customer( "safal");
         customer.addRental(new Rental(new Movie ("Dunkirk", Movie.REGULAR), 7));
        customer.addRental(new Rental(new Movie ("Dumbo", Movie.CHILDRENS), 7));
        customer.addRental(new Rental(new Movie ("Jawani", Movie.NEW_RELEASE), 7));
        String statement = customer.statement();
        Assert.assertEquals("Rental Record for safal\n" +
                "\tDunkirk\t9.5\n" +
                "\tDumbo\t7.5\n" +
                "\tJawani\t21.0\n" +
                "Amount owed is 38.0\n" +
                "You earned 4 frequent renter points",statement);
    }

}