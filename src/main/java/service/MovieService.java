package service;

import domain.Movie;
import domain.ParentalControlLevel;
import exception.TechnicalFailureException;
import exception.TitleNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class MovieService {
    private static Map<String, Movie> parentalControlMapByMovieId = new HashMap<>();

    static {
        Movie toyStory = new Movie(ParentalControlLevel.PARENTAL_CONTROL_LEVEL_1, "Toy Story");
        Movie thePrestige = new Movie(ParentalControlLevel.PARENTAL_CONTROL_LEVEL_3, "The Prestige");
        Movie theHangover = new Movie(ParentalControlLevel.PARENTAL_CONTROL_LEVEL_5, "The Hangover");
        Movie skyfall = new Movie(ParentalControlLevel.PARENTAL_CONTROL_LEVEL_7, "James Bond Skyfall");
        Movie fiftyShadesOfGrey = new Movie(ParentalControlLevel.PARENTAL_CONTROL_LEVEL_10, "Fifty Shades Of Grey");

        parentalControlMapByMovieId.put("1", toyStory);
        parentalControlMapByMovieId.put("2", thePrestige);
        parentalControlMapByMovieId.put("3", theHangover);
        parentalControlMapByMovieId.put("4", skyfall);
        parentalControlMapByMovieId.put("5", fiftyShadesOfGrey);
    }

    public String getParentalControlLevel(String movieId) throws TitleNotFoundException, TechnicalFailureException {
        try {
            return parentalControlMapByMovieId.get(movieId).getParentalControlLevel();
        } catch (NullPointerException e) {
            throw new TitleNotFoundException();
        } catch (Exception e) {
            throw new TechnicalFailureException();
        }
    }
}
