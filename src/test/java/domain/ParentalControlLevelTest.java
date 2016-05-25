package domain;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ParentalControlLevelTest {
    @Test
    public void areParentalControlLevelsMappedCorrectly() {
        ParentalControlLevel parentalControlLevel = new ParentalControlLevel();
        assertEquals(parentalControlLevel.getParentalControlLevelsMap().get("U"), Integer.valueOf(1));
        assertEquals(parentalControlLevel.getParentalControlLevelsMap().get("PG"), Integer.valueOf(3));
        assertEquals(parentalControlLevel.getParentalControlLevelsMap().get("12"), Integer.valueOf(5));
        assertEquals(parentalControlLevel.getParentalControlLevelsMap().get("15"), Integer.valueOf(7));
        assertEquals(parentalControlLevel.getParentalControlLevelsMap().get("18"), Integer.valueOf(10));
    }
}
