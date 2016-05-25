package domain;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MovieTest {
    @Test
    public void testMovieIdAndNamesAreCorrect() {
        String parentalControlLevel = "18";
        String movieName = "James Bond Skyfall";

        Movie movie = new Movie(parentalControlLevel, movieName);

        assertEquals(movie.getParentalControlLevel(), "18");
        assertEquals(movie.getName(), "James Bond Skyfall");
    }
}
