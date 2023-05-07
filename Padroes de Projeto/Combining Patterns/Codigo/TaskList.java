import java.util.ArrayList;
import java.util.List;

public class TaskList implements TaskComponent {
    
    private String name;
    private List<TaskComponent> children;

    public TaskList(String name) {
        this.name = name;
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
}