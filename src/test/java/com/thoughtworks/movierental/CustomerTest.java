package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    @Test
    public void shouldGenerateTextStatement() {
        Customer customer = new Customer("Bruce Wayne");
        customer.addRental(new Rental(new Movie("Home Alone 1", Movie.CHILDRENS), 5));
        customer.addRental(new Rental(new Movie("Home Alone 2", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("Home Alone 3", Movie.REGULAR), 5));

        String statement = customer.statement();

        Assert.assertEquals("Rental Record for Bruce Wayne\n" +
                "\tHome Alone 1\t4.5\n" +
                "\tHome Alone 2\t15.0\n" +
                "\tHome Alone 3\t6.5\n" +
                "Amount owed is 26.0\n" +
                "You earned 4 frequent renter points", statement);
    }

    @Test
    public void shouldGenerateHtmlStatement() {
        Customer customer = new Customer("Bruce Wayne");
        customer.addRental(new Rental(new Movie("Home Alone 1", Movie.CHILDRENS), 5));
        customer.addRental(new Rental(new Movie("Home Alone 2", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("Home Alone 3", Movie.REGULAR), 5));

        String statement = customer.htmlStatement();

        Assert.assertEquals("<h3>Rental Record for Bruce Wayne</h3>" +
                "<p>" +
                "Home Alone 1: <b>4.5</b><br/>" +
                "Home Alone 2: <b>15.0</b><br/>" +
                "Home Alone 3: <b>6.5</b><br/>" +
                "</p>" +
                "<p>Amount owed is <b>26.0</b></p>" +
                "<p>You earned <b>4</b> frequent renter points</p>", statement);
    }

}