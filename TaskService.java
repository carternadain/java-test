import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TaskService {
    private final Map<String, Task> taskMap = new HashMap<>(); // Stores tasks in memory

    public void addTask(String name, String description) {
        // Generate a unique task ID and add the task
        String taskId = UUID.randomUUID().toString().substring(0, 10);
        taskMap.put(taskId, new Task(taskId, name, description));
    }

    public void deleteTask(String taskId) {
        // Remove task from map
        taskMap.remove(taskId);
    }

    public void updateTaskName(String taskId, String name) {
        // Check if task exists before updating name
        if (taskMap.containsKey(taskId)) {
            taskMap.get(taskId).setName(name);
        }
    }

    public void updateTaskDescription(String taskId, String description) {
        // Check if task exists before updating description
        if (taskMap.containsKey(taskId)) {
            taskMap.get(taskId).setDescription(description);
        }
    }
} 