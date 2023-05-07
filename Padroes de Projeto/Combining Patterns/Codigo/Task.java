import java.util.ArrayList;
import java.util.List;

public class Task implements TaskComponent {
    
    private String name;
    private int priority;
    private String dueDate;
    private List<TaskComponent> children;

    public Task(String name, int priority, String dueDate) {
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        children = new ArrayList<>();
    }

    @Override
    public void add(TaskComponent component) {
        children.add(component);
    }

    @Override
    public void remove(TaskComponent component) {
        children.remove(component);
    }

    @Override
    public List<TaskComponent> getChildren() {
        return children;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }
    
}