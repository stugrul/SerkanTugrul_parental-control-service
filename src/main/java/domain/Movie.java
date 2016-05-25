package domain;

public class Movie {
    private String name;
    private String parentalControlLevel;

    public Movie(String parentalControlLevel, String name) {
        this.parentalControlLevel = parentalControlLevel;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getParentalControlLevel() {
        return parentalControlLevel;
    }
}
