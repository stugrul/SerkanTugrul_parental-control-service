package service;

import exception.TechnicalFailureException;
import exception.TitleNotFoundException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MovieServiceTest {
    private MovieService movieService;

    @BeforeMethod
    public void setUp() throws Exception {
        this.movieService = new MovieService();
    }

    @Test
    public void testGetParentalControlLevel() throws TechnicalFailureException, TitleNotFoundException {
        assertEquals(movieService.getParentalControlLevel("1"), "U");
        assertEquals(movieService.getParentalControlLevel("2"), "PG");
        assertEquals(movieService.getParentalControlLevel("3"), "12");
        assertEquals(movieService.getParentalControlLevel("4"), "15");
        assertEquals(movieService.getParentalControlLevel("5"), "18");
    }

    @Test(expectedExceptions = TitleNotFoundException.class)
    public void testTitleNotFoundExceptionIsThrown() throws TechnicalFailureException, TitleNotFoundException {
        movieService.getParentalControlLevel("6");
    }
}
