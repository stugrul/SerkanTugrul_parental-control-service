package domain;

import java.util.HashMap;
import java.util.Map;

public class ParentalControlLevel {
    public static final String PARENTAL_CONTROL_LEVEL_1 = "U";
    public static final String PARENTAL_CONTROL_LEVEL_3 = "PG";
    public static final String PARENTAL_CONTROL_LEVEL_5 = "12";
    public static final String PARENTAL_CONTROL_LEVEL_7 = "15";
    public static final String PARENTAL_CONTROL_LEVEL_10 = "18";

    private static Map<String, Integer> parentalControlLevelsMap = new HashMap<>();

    static {
        parentalControlLevelsMap.put(PARENTAL_CONTROL_LEVEL_1, 1);
        parentalControlLevelsMap.put(PARENTAL_CONTROL_LEVEL_3, 3);
        parentalControlLevelsMap.put(PARENTAL_CONTROL_LEVEL_5, 5);
        parentalControlLevelsMap.put(PARENTAL_CONTROL_LEVEL_7, 7);
        parentalControlLevelsMap.put(PARENTAL_CONTROL_LEVEL_10, 10);
    }

    public Map<String, Integer> getParentalControlLevelsMap() {
        return parentalControlLevelsMap;
    }
}
