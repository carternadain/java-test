package src.main.java.com.contacts;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contactMap = new HashMap<>();

    // Add contact
    public void addContact(Contact contact) {
        if (contactMap.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID must be unique");
        }
        contactMap.put(contact.getContactId(), contact);
    }

    // Delete contact
    public void deleteContact(String contactId) {
        if (!contactMap.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        contactMap.remove(contactId);
    }

    // Update contact details
    public void updateContact(String contactId, Contact updatedContact) {
        if (!contactMap.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID does not exist");
        }
        contactMap.put(contactId, updatedContact);
    }

    // Get contact by ID
    public Contact getContact(String contactId) {
        return contactMap.get(contactId);
    }
}
