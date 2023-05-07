import java.util.List;

public interface TaskComponent {

    void add(TaskComponent component);
    void remove(TaskComponent component);
    List<TaskComponent> getChildren();
    String getName();

}