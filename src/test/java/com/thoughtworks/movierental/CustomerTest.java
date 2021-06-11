package com.thoughtworks.movierental;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void shouldGenerateTextStatement() {

        Customer customer = new Customer("John Doe");

        customer.addRental(new Rental(new Movie("Jumanji", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("3 idiots", Movie.REGULAR), 4));
        customer.addRental(new Rental(new Movie("Avengers", Movie.NEW_RELEASE), 15));

        String statement = customer.statement();
        
        Assert.assertEquals(statement, "Rental Record for John Doe\n" +
                "\tJumanji\t1.5\n" +
                "\t3 idiots\t5.0\n" +
                "\tAvengers\t45.0\n" +
                "Amount owed is 51.5\n" +
                "You earned 4 frequent renter points");
    }

    @Test
    public void shouldGenerateHtmlStatement() {

        Customer customer = new Customer("John Doe");

        customer.addRental(new Rental(new Movie("Jumanji", Movie.CHILDRENS), 2));
        customer.addRental(new Rental(new Movie("3 idiots", Movie.REGULAR), 4));
        customer.addRental(new Rental(new Movie("Avengers", Movie.NEW_RELEASE), 15));

        String htmlStatement = customer.htmlStatement();

        Assert.assertEquals("<h3>Rental Record for John Doe</h3><br/>" +
                "<p>Jumanji: <b>1.5</b><br/>" +
                "3 idiots: <b>5.0</b><br/>" +
                "Avengers: <b>45.0</b><br/></p>" +
                "<p>Amount owed is <b>51.5</b></p>" +
                "<p>You earned <b>4</b> frequent renter points</p>", htmlStatement);
    }

}