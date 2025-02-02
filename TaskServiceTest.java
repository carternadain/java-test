import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
    @Test
    public void testAddTask() {
        // Ensure a task is added successfully
        TaskService service = new TaskService();
        service.addTask("New Task", "New Description");
        assertFalse(service.taskMap.isEmpty());
    }

    @Test
    public void testDeleteTask() {
        // Ensure a task can be deleted
        TaskService service = new TaskService();
        service.addTask("Task To Delete", "Description");
        String taskId = service.taskMap.keySet().iterator().next();
        service.deleteTask(taskId);
        assertFalse(service.taskMap.containsKey(taskId));
    }
}