// TaskTest.java

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTaskCreation() {
        // Ensure task is created with correct values
        Task task = new Task("1234567890", "Test Task", "This is a test task.");
        assertEquals("1234567890", task.getTaskId());
        assertEquals("Test Task", task.getName());
        assertEquals("This is a test task.", task.getDescription());
    }

    @Test
    public void testInvalidTaskCreation() {
        // Ensure invalid inputs throw errors
        assertThrows(IllegalArgumentException.class, () -> new Task(null, "Valid Name", "Valid Description"));
        assertThrows(IllegalArgumentException.class, () -> new Task("12345678901", "Valid Name", "Valid Description"));
    }
}