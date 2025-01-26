package src.test.java.com.contacts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testValidContact() {
        Contact contact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        assertNotNull(contact);
    }

    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    public void testNullFirstName() {
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", null, "Doe", "1234567890", "123 Main St"));
    }

  
}
