package utils.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneTest {
    @Test
    void testPhoneDescription() {
        Phone phone = new Phone("iPhone 12", 999.0);
        assertEquals("Phone: iPhone 12, Price: $999.0", phone.getDescription());
    }

    @Test
    void testPhoneGetName() {
        Phone phone = new Phone("iPhone 12", 999.0);
        assertEquals("iPhone 12", phone.getName());
    }

    @Test
    void testPhoneGetPrice() {
        Phone phone = new Phone("iPhone 12", 999.0);
        assertEquals(999.0, phone.getPrice());
    }
}