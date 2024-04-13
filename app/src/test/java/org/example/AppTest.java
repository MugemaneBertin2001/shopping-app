package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

class CustomAppTest {
    @Test
    void appReturnsCorrectGreeting() {
        App app = new App();
        int currentHour = LocalTime.now().getHour();
        String expectedGreeting;
        if (currentHour < 12) {
            expectedGreeting = "Good morning!";
        } else if (currentHour < 18) {
            expectedGreeting = "Good afternoon!";
        } else {
            expectedGreeting = "Good evening!";
        }
        assertEquals(expectedGreeting, app.getGreeting(), "App should return the correct greeting");
    }
}
