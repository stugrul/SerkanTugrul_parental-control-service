package service;

import domain.ParentalControlLevel;
import exception.TechnicalFailureException;
import exception.TitleNotFoundException;

public class ParentalControlService {
    private final MovieService movieService = new MovieService();
    private final ParentalControlLevel parentalControlLevelMap = new ParentalControlLevel();

    public boolean verifyParentalControlLevel(String parentalControlLevelPreference, String movieId) {
        try {
            String parentalControlLevel = movieService.getParentalControlLevel(movieId);

            int valueOfControlLevelPreference = parentalControlLevelMap.getParentalControlLevelsMap().get(parentalControlLevelPreference);
            int valueOfMovieParentalControlLevel = parentalControlLevelMap.getParentalControlLevelsMap().get(parentalControlLevel);

            return valueOfControlLevelPreference >= valueOfMovieParentalControlLevel;
        } catch (TitleNotFoundException e) {
            System.out.println("The movie service could not find the given movie");
            return false;
        } catch (TechnicalFailureException e) {
            System.out.println("System Error");
            return false;
        }
    }
}
