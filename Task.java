
public class Task {
    private final String taskId; // Unique task ID that cannot be changed
    private String name; // Task name, must not be null or too long
    private String description; // Task description, must not be null or too long

    public Task(String taskId, String name, String description) {
        // Validate task ID
        if (taskId == null || taskId.length() > 10) throw new IllegalArgumentException("Invalid Task ID");
        // Validate name
        if (name == null || name.length() > 20) throw new IllegalArgumentException("Invalid Task Name");
        // Validate description
        if (description == null || description.length() > 50) throw new IllegalArgumentException("Invalid Task Description");
        
        this.taskId = taskId;
        this.name = name;
        this.description = description;
    }

    public String getTaskId() { return taskId; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    
    public void setName(String name) {
        // Validate name before updating
        if (name == null || name.length() > 20) throw new IllegalArgumentException("Invalid Task Name");
        this.name = name;
    }
    
    public void setDescription(String description) {
        // Validate description before updating
        if (description == null || description.length() > 50) throw new IllegalArgumentException("Invalid Task Description");
        this.description = description;
    }
} 