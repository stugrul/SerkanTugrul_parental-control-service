package service;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ParentalControlServiceTest {
    private ParentalControlService parentalControlService;

    @BeforeMethod
    public void setUp() throws Exception {
        parentalControlService = new ParentalControlService();
    }

    @Test
    public void testVerifyParentalControlLevel() {
        assertTrue(parentalControlService.verifyParentalControlLevel("U", "1"));
        assertFalse(parentalControlService.verifyParentalControlLevel("U", "5"));
        assertFalse(parentalControlService.verifyParentalControlLevel("15", "5"));
        assertTrue(parentalControlService.verifyParentalControlLevel("PG", "1"));
        assertTrue(parentalControlService.verifyParentalControlLevel("PG", "2"));
        assertTrue(parentalControlService.verifyParentalControlLevel("15", "4"));
    }

    @Test
    public void whenExceptionThrown() {
        // when the user passes an invalid movie id, TitleNotFoundException should be thrown
        // and the service should return false
        assertFalse(parentalControlService.verifyParentalControlLevel("U", "8"));
    }
}
